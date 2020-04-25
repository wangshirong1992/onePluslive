package com.live.oneplus.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.live.oneplus.sms.entity.HomeSubjectEntity;
import com.live.core.bean.PageVo;
import com.live.core.bean.QueryCondition;


/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author Mr.Wang
 * @email 877052174@qq.com
 * @date 2020-04-25 11:02:56
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageVo queryPage(QueryCondition params);
}

