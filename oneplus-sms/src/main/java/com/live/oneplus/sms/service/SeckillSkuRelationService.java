package com.live.oneplus.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.live.oneplus.sms.entity.SeckillSkuRelationEntity;
import com.live.core.bean.PageVo;
import com.live.core.bean.QueryCondition;


/**
 * 秒杀活动商品关联
 *
 * @author Mr.Wang
 * @email 877052174@qq.com
 * @date 2020-04-25 11:02:56
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageVo queryPage(QueryCondition params);
}

