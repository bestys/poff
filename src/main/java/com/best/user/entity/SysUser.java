package com.best.user.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
@Data
public class SysUser extends Model<SysUser> implements Serializable {
    static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private String password;
}