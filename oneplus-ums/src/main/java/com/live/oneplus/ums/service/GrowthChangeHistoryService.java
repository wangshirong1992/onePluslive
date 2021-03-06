package com.live.oneplus.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.live.oneplus.ums.entity.GrowthChangeHistoryEntity;
import com.live.core.bean.PageVo;
import com.live.core.bean.QueryCondition;


/**
 * 成长值变化历史记录
 *
 * @author Mr.Wang
 * @email 877052174@qq.com
 * @date 2020-05-03 21:39:42
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageVo queryPage(QueryCondition params);
}

