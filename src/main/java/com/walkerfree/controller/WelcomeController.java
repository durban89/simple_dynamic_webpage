package com.walkerfree.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * WelcomeController
 */
@Controller
public class WelcomeController {
    @RequestMapping("/")
    public String index(Model model) {
        // 这里我们设置动态数据 - 每访问页面一次，数据都会从服务器重新获取新的数据
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-d HH:mm:ss");
        String dateString = df.format(new Date());
        model.addAttribute("time", dateString);

        return "welcome/index";
    }
    
}