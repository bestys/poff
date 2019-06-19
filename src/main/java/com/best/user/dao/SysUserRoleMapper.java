package com.best.user.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.best.SuperMapper;
import com.best.user.entity.SysUserRole;

public interface SysUserRoleMapper extends SuperMapper<SysUserRole> {
	@Select("SELECT * FROM sys_user_role WHERE user_id = #{userId}")
    List<SysUserRole> listByUserId(Integer userId);
}
