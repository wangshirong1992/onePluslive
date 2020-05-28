package com.live.oneplus.pms.service.impl;

import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.live.core.bean.PageVo;
import com.live.core.bean.Query;
import com.live.core.bean.QueryCondition;

import com.live.oneplus.pms.dao.SpuInfoDao;
import com.live.oneplus.pms.entity.SpuInfoEntity;
import com.live.oneplus.pms.service.SpuInfoService;


@Service("spuInfoService")
public class SpuInfoServiceImpl extends ServiceImpl<SpuInfoDao, SpuInfoEntity> implements SpuInfoService {
    //@GlobalTransactional
    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SpuInfoEntity> page = this.page(
                new Query<SpuInfoEntity>().getPage(params),
                new QueryWrapper<SpuInfoEntity>()
        );

        return new PageVo(page);
    }

}