package com.live.oneplus.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.live.oneplus.sms.entity.SkuLadderEntity;
import com.live.core.bean.PageVo;
import com.live.core.bean.QueryCondition;


/**
 * 商品阶梯价格
 *
 * @author Mr.Wang
 * @email 877052174@qq.com
 * @date 2020-04-25 11:02:55
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageVo queryPage(QueryCondition params);
}

