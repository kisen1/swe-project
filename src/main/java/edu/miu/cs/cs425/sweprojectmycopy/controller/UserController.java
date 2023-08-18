package edu.miu.cs.cs425.sweprojectmycopy.controller;

import edu.miu.cs.cs425.sweprojectmycopy.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/webshop/app/v1/user")
public class UserController {
    private IUserService userService;

    @Autowired
    public UserController(IUserService userService) {
        this.userService = userService;
    }

}
