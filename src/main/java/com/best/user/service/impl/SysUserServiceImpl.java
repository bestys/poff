package com.best.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.best.user.dao.SysUserMapper;
import com.best.user.entity.SysUser;
import com.best.user.service.ISysUserService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper<SysUser>, SysUser> implements ISysUserService {
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
}
