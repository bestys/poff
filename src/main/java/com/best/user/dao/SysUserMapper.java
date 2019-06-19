package com.best.user.dao;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.best.SuperMapper;
import com.best.user.entity.SysUser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SysUserMapper extends SuperMapper<SysUser> {
    int deleteAll();
    @Select("select * FROM sys_user")
    List<SysUser> selectListBySQL();
    @Select("SELECT * FROM sys_user WHERE name = #{name}")
    SysUser selectByName(String name);
    List<SysUser> selectListByWrapper(@Param("ew") Wrapper wrapper);
}
