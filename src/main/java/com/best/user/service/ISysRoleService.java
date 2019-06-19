package com.best.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.best.user.entity.SysRole;

public interface ISysRoleService extends IService<SysRole>{
	public SysRole selectById(Integer id);
}
