package com.codejam.userservice.controller;

import com.codejam.userservice.dto.LoginRequest;
import com.codejam.userservice.dto.SignUpRequest;
import com.codejam.userservice.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user-service")
public class UserController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/logIn")
    public String login(@RequestBody LoginRequest loginRequest){
        loginService.login(loginRequest);
        return "Successfully logged in";
    }

    @PostMapping("/signUp")
    public String login(@RequestBody SignUpRequest signUpRequest){
        try {
            loginService.signUp(signUpRequest);
        }
        catch (Exception e){
        return e.getMessage();
        }
        return  "created the account";
    }

    @GetMapping("/getUserId")
    public Long getUserId(@RequestParam String userName){

             return  loginService.getUserId(userName);
    }
}
