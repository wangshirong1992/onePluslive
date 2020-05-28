package com.live.oneplus.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.live.oneplus.ums.entity.MemberCollectSpuEntity;
import com.live.core.bean.PageVo;
import com.live.core.bean.QueryCondition;


/**
 * 会员收藏的商品
 *
 * @author Mr.Wang
 * @email 877052174@qq.com
 * @date 2020-05-03 21:39:42
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageVo queryPage(QueryCondition params);
}

