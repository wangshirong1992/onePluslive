package com.live.oneplus.ums.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.live.core.bean.PageVo;
import com.live.core.bean.Query;
import com.live.core.bean.QueryCondition;

import com.live.oneplus.ums.dao.MemberStatisticsInfoDao;
import com.live.oneplus.ums.entity.MemberStatisticsInfoEntity;
import com.live.oneplus.ums.service.MemberStatisticsInfoService;


@Service("memberStatisticsInfoService")
public class MemberStatisticsInfoServiceImpl extends ServiceImpl<MemberStatisticsInfoDao, MemberStatisticsInfoEntity> implements MemberStatisticsInfoService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<MemberStatisticsInfoEntity> page = this.page(
                new Query<MemberStatisticsInfoEntity>().getPage(params),
                new QueryWrapper<MemberStatisticsInfoEntity>()
        );

        return new PageVo(page);
    }

}