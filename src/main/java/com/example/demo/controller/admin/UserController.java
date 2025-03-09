package com.example.demo.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UserController {
    @GetMapping("admin/users")
    public String getUserPage() {
        return "admin/user/show";
    }
    
}
