package com.walkerfree.controller;

import com.walkerfree.model.User;
import com.walkerfree.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * UserController
 */
@Controller // 这里的意思是这个类是一个控制器类
@RequestMapping("/user") // 这里的意思是 URL是/user开始的
public class UserController {
    @Autowired // 这里的意思是获得一个bean叫做userRepository，userRepository是Spring自动产生的，我们将用它来控制数据

    private UserRepository userRepository;

    @GetMapping(path = "/add") // 只Map到GET请求
    public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String email) {
        // @ResponseBody 意思是返回的String是一个响应体，不是一个视图的名称
        // @RequestParam 意思是从GET或POST请求的一个参数

        User u = new User();
        u.setName(name);
        u.setEmail(email);
        userRepository.save(u);
        return "Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

}