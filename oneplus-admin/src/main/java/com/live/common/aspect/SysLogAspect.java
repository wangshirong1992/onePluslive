/**
 * Copyright (c) 2016-2019 谷粒开源 All rights reserved.
 *
 * https://www.guli.cloud
 *
 * 版权所有，侵权必究！
 */

package com.live.common.aspect;

import com.live.common.annotation.SysLog;
import com.live.common.utils.IPUtils;
import com.live.modules.sys.entity.SysLogEntity;
import com.live.modules.sys.entity.SysUserEntity;
import com.live.modules.sys.service.SysLogService;
import com.google.gson.Gson;
import com.live.common.utils.HttpContextUtils;
import org.apache.shiro.SecurityUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.DefaultParameterNameDiscoverer;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Date;


/**
 * 系统日志，切面处理类
 *
 * @author Mark sunlightcs@gmail.com
 */
@Aspect
@Component
public class SysLogAspect {
	@Autowired
	private SysLogService sysLogService;
	
	@Pointcut("@annotation(com.live.common.annotation.SysLog)")
	public void logPointCut() { 
		
	}

	@Around("logPointCut()")
	public Object around(ProceedingJoinPoint point) throws Throwable {
		long beginTime = System.currentTimeMillis();
		//执行方法
		Object result = point.proceed();
		//执行时长(毫秒)
		long time = System.currentTimeMillis() - beginTime;

		//保存日志
		saveSysLog(point, time);

		return result;
	}

	private void saveSysLog(ProceedingJoinPoint joinPoint, long time) {
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();

		SysLogEntity sysLog = new SysLogEntity();
		SysLog syslog = method.getAnnotation(SysLog.class);
		if(syslog != null){
			//注解上的描述
			sysLog.setOperation(syslog.value());
		}

		//请求的方法名
		String className = joinPoint.getTarget().getClass().getName();
		String methodName = signature.getName();
		sysLog.setMethod(className + "." + methodName + "()");

		//请求的参数
		Object[] args = joinPoint.getArgs();
		try{
			String params = new Gson().toJson(args);
			sysLog.setParams(params);
		}catch (Exception e){

		}

		//获取request
		HttpServletRequest request = HttpContextUtils.getHttpServletRequest();
		//设置IP地址
		//sysLog.setIp(IPUtils.getIpAddr(request));
		sysLog.setIp("12323123123");

		//用户名
		//String username = ((SysUserEntity) SecurityUtils.getSubject().getPrincipal()).getUsername();
		//sysLog.setUsername(username);

		//将注解的值中的El表达式部分进行替换
		//创建解析器
		SpelExpressionParser parser = new SpelExpressionParser();
		//获取表达式
		Expression expression = parser.parseExpression(syslog.desc());
		//设置解析上下文(有哪些占位符，以及每种占位符的值)
		EvaluationContext context = new StandardEvaluationContext();

		//获取运行时参数的名称
		DefaultParameterNameDiscoverer discoverer = new DefaultParameterNameDiscoverer();
		String[] parameterNames = discoverer.getParameterNames(method);
		for (int i = 0; i < parameterNames.length; i++) {
			context.setVariable(parameterNames[i],args[i].toString());
		}
		//解析,获取替换后的结果
		String result = expression.getValue(context).toString();

		System.out.println(result);

		sysLog.setUsername(result);

		sysLog.setTime(time);
		sysLog.setCreateDate(new Date());
		//保存系统日志
		sysLogService.save(sysLog);
	}
}
