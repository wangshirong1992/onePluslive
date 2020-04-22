package com.live.oneplus.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.live.oneplus.pms.entity.AttrAttrgroupRelationEntity;
import com.live.core.bean.PageVo;
import com.live.core.bean.QueryCondition;


/**
 * 属性&属性分组关联
 *
 * @author Mr.Wang
 * @email 877052174@qq.com
 * @date 2020-04-22 21:08:39
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageVo queryPage(QueryCondition params);
}

