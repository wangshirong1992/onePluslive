package com.live.oneplus.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.live.core.bean.Resp;
import com.live.oneplus.ums.entity.MemberEntity;
import com.live.core.bean.PageVo;
import com.live.core.bean.QueryCondition;


/**
 * 会员
 *
 * @author Mr.Wang
 * @email 877052174@qq.com
 * @date 2020-05-03 21:39:42
 */
public interface MemberService extends IService<MemberEntity> {

    PageVo queryPage(QueryCondition params);

    Boolean checkData(String data, Integer type);
}

