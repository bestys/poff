package com.best.user.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.extension.activerecord.Model;

import lombok.Data;
@Data
public class SysUserRole extends Model<SysUserRole> implements Serializable {
    static final long serialVersionUID = 1L;

    private Integer userId;

    private Integer roleId;

}
