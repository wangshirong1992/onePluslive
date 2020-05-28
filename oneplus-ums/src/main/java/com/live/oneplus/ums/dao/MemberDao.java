package com.live.oneplus.ums.dao;

import com.live.oneplus.ums.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author Mr.Wang
 * @email 877052174@qq.com
 * @date 2020-05-03 21:39:42
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
