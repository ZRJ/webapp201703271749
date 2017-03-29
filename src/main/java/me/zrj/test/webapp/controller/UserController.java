package me.zrj.test.webapp.controller;

import me.zrj.test.webapp.model.User;
import me.zrj.test.webapp.service.IUserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by ZRJ on 2017/3/29.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    private static Logger logger = LoggerFactory.getLogger(UserController.class);
    @Resource
    private IUserService userService;

    @RequestMapping("/showUser")
    public String toIndex(HttpServletRequest request, Model model){
        int userId = Integer.parseInt(request.getParameter("id"));
        logger.info("根据用户 id = {}查询", userId);
        User user = this.userService.getUserById(userId);
        logger.info("查询用户 id = {} 返回的结果是 {}", userId, user.toString());
        model.addAttribute("user", user);
        return "showUser";
    }
}
