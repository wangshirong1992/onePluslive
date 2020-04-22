package com.live.oneplus.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.live.oneplus.pms.entity.SpuCommentEntity;
import com.live.core.bean.PageVo;
import com.live.core.bean.QueryCondition;


/**
 * 商品评价
 *
 * @author Mr.Wang
 * @email 877052174@qq.com
 * @date 2020-04-22 21:08:39
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageVo queryPage(QueryCondition params);
}

