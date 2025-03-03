package org.launchcode.spaday.controllers;

import org.launchcode.spaday.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("user")
public class UserController {

    @GetMapping("/add")
    public String displayAddUserForm(){
        return "user/add";
    }
    @PostMapping
    public String processAddUserForm(Model model, @ModelAttribute User user, String verify) {
        if (user.getPassword().equals(verify)) {
            return "user/index";
        } else {
            return "user/add";
        }
    }

    @GetMapping("/index")
    public String UserController(){
        return "user/index";
    }
}
