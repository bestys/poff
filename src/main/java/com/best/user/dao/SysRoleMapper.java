package com.best.user.dao;

import org.apache.ibatis.annotations.Select;

import com.best.SuperMapper;
import com.best.user.entity.SysRole;

public interface SysRoleMapper extends SuperMapper<SysRole> {
	@Select("SELECT * FROM sys_role WHERE id = #{id}")
    SysRole selectById(Integer id);
}
