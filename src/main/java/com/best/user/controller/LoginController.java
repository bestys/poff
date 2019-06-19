package com.best.user.controller;

import com.best.user.entity.SysUser;
import com.best.user.service.ISysUserService;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LoginController {
	private Logger logger = LoggerFactory.getLogger(LoginController.class);
	
    @Autowired
    private ISysUserService sysUserService;
	
	@RequestMapping("/")
    public ModelAndView showHome() {
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        logger.info("当前登陆用户：" + name);
        return new ModelAndView("home");
    }

    @RequestMapping("/login")
    public ModelAndView showLogin() {
    	System.out.println("---------------------来了");
    	List<SysUser> result = sysUserService.selectListBySQL();
    	System.out.println(result.get(0).toString());
        return new ModelAndView("login");
    }
    
    @RequestMapping("/admin")
    @ResponseBody
    @PreAuthorize("hasRole('ADMIN')")
    public String printAdmin() {
        return "如果你看见这句话，说明你有ROLE_ADMIN角色";
    }

    @RequestMapping("/user")
    @ResponseBody
    @PreAuthorize("hasRole('USER')")
    public String printUser() {
        return "如果你看见这句话，说明你有ROLE_USER角色";
    }
}
