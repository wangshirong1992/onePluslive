package com.live.oneplus.pms.dao;

import com.live.oneplus.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author Mr.Wang
 * @email 877052174@qq.com
 * @date 2020-04-22 21:08:39
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
