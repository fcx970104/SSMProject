package com.fcx.controller;

import com.alibaba.fastjson.JSON;
import com.fcx.pojo.User;
import com.fcx.service.IUserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @Author: fancaixing
 * @Date: 2019/7/7 0:39
 * @Version 1.0
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService userService;
    private static Logger logger = Logger.getLogger(UserController.class);

    @RequestMapping("/showUser")
    public String toIndex(HttpServletRequest request, Model model){
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = this.userService.getUserById(userId);
        model.addAttribute("user", user);
        logger.info(JSON.toJSONString(user));
        return "showUser";
    }
}
