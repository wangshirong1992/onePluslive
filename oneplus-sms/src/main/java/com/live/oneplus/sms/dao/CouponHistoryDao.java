package com.live.oneplus.sms.dao;

import com.live.oneplus.sms.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author Mr.Wang
 * @email 877052174@qq.com
 * @date 2020-04-25 11:02:56
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
