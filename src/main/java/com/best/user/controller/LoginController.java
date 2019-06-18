package com.best.user.controller;

import com.best.user.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private ISysUserService sysUserService;

    @RequestMapping("/login")
    public String showLogin() {
        sysUserService.selectListBySQL();
        return "login.html";
    }
}
