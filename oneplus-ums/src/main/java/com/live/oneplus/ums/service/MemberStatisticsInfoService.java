package com.live.oneplus.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.live.oneplus.ums.entity.MemberStatisticsInfoEntity;
import com.live.core.bean.PageVo;
import com.live.core.bean.QueryCondition;


/**
 * 会员统计信息
 *
 * @author Mr.Wang
 * @email 877052174@qq.com
 * @date 2020-05-03 21:39:42
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageVo queryPage(QueryCondition params);
}

