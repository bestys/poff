package com.best.user.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.best.user.dao.SysUserMapper;
import com.best.user.entity.SysUser;
import com.best.user.service.ISysUserService;
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {
    @Override
    public boolean deleteAll() {
        return retBool(baseMapper.deleteAll());
    }

    @Override
    public List<SysUser> selectListBySQL() {
        return baseMapper.selectListBySQL();
    }

    @Override
    public List<SysUser> selectListByWrapper(Wrapper wrapper) {
        return baseMapper.selectListByWrapper(wrapper);
    }
    
    public SysUser selectByName(String name) {
        return baseMapper.selectByName(name);
    }
}
