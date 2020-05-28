package com.live.oneplus.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.live.oneplus.ums.entity.MemberLevelEntity;
import com.live.core.bean.PageVo;
import com.live.core.bean.QueryCondition;


/**
 * 会员等级
 *
 * @author Mr.Wang
 * @email 877052174@qq.com
 * @date 2020-05-03 21:39:42
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageVo queryPage(QueryCondition params);
}

