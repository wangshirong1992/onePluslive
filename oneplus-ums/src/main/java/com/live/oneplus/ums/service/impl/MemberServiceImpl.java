package com.live.oneplus.ums.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.live.core.bean.PageVo;
import com.live.core.bean.Query;
import com.live.core.bean.QueryCondition;

import com.live.oneplus.ums.dao.MemberDao;
import com.live.oneplus.ums.entity.MemberEntity;
import com.live.oneplus.ums.service.MemberService;


@Service("memberService")
public class MemberServiceImpl extends ServiceImpl<MemberDao, MemberEntity> implements MemberService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<MemberEntity> page = this.page(
                new Query<MemberEntity>().getPage(params),
                new QueryWrapper<MemberEntity>()
        );

        return new PageVo(page);
    }

    @Override
    public Boolean checkData(String data, Integer type) {
        QueryWrapper<MemberEntity> queryWrapper = new QueryWrapper<>();
        switch (type){
            case 1:queryWrapper.eq("username",data); break;
            case 2:queryWrapper.eq("mobile",data); break;
            case 3:queryWrapper.eq("email",data); break;
            default:return false;
        }
        return this.count(queryWrapper)==0;
    }

}