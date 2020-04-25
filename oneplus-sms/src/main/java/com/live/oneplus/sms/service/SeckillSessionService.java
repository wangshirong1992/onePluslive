package com.live.oneplus.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.live.oneplus.sms.entity.SeckillSessionEntity;
import com.live.core.bean.PageVo;
import com.live.core.bean.QueryCondition;


/**
 * 秒杀活动场次
 *
 * @author Mr.Wang
 * @email 877052174@qq.com
 * @date 2020-04-25 11:02:55
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageVo queryPage(QueryCondition params);
}

