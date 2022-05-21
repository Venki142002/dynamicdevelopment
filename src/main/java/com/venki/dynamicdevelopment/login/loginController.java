package com.venki.dynamicdevelopment.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class loginController
{
    @RequestMapping("/")
    public String login()
    {
        return  "";
    }

}
