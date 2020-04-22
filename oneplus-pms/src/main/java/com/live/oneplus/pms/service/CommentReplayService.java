package com.live.oneplus.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.live.oneplus.pms.entity.CommentReplayEntity;
import com.live.core.bean.PageVo;
import com.live.core.bean.QueryCondition;


/**
 * 商品评价回复关系
 *
 * @author Mr.Wang
 * @email 877052174@qq.com
 * @date 2020-04-22 21:08:39
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageVo queryPage(QueryCondition params);
}

