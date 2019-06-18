package com.best.user.dao;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.best.user.entity.SysUser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SysUserMapper<T> extends BaseMapper<T> {
    int deleteAll();
    @Select("select id, name, password from sys_user")
    List<SysUser> selectListBySQL();

    List<SysUser> selectListByWrapper(@Param("ew") Wrapper wrapper);
}
