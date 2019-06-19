package com.best.user.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.extension.activerecord.Model;

import lombok.Data;
@Data
public class SysRole extends Model<SysRole> implements Serializable {
    static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

}
