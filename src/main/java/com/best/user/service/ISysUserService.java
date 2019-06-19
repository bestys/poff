package com.best.user.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.best.user.entity.SysUser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ISysUserService extends IService<SysUser> {
    boolean deleteAll();

    public List<SysUser> selectListBySQL();

    public SysUser selectByName(String name);
    
    public List<SysUser> selectListByWrapper(Wrapper wrapper);
}
