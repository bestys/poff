package com.best.user.service;

import java.util.List;

import com.best.user.entity.SysUserRole;

public interface ISysUserRoleService {
	public List<SysUserRole> listByUserId(Integer userId);
}
