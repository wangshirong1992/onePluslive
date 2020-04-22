package com.live.oneplus.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.live.oneplus.pms.entity.BrandEntity;
import com.live.core.bean.PageVo;
import com.live.core.bean.QueryCondition;


/**
 * 品牌
 *
 * @author Mr.Wang
 * @email 877052174@qq.com
 * @date 2020-04-22 21:08:39
 */
public interface BrandService extends IService<BrandEntity> {

    PageVo queryPage(QueryCondition params);
}

