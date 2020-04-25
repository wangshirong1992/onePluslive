package com.live.oneplus.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.live.core.bean.PageVo;
import com.live.core.bean.QueryCondition;
import com.live.oneplus.sms.entity.CouponHistoryEntity;


/**
 * 优惠券领取历史记录
 *
 * @author Mr.Wang
 * @email 877052174@qq.com
 * @date 2020-04-25 11:02:56
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageVo queryPage(QueryCondition params);
}

