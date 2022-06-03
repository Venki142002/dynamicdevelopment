package com.venki.dynamicdevelopment.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class adminprofile {

//
//    //logout
//    @RequestMapping( "logout")
//    public String logout( HttpServletRequest req)
//    {
//        HttpSession session = req.getSession();
//        session.removeAttribute("username");
//        return "index";
//    }


    //REGISTRATION PAGE PROCESS
    @RequestMapping("Registration")
    public String regform(HttpServletRequest req) {
        HttpSession session = req.getSession();
        session.removeAttribute("result");
        return "Registration";
    }


}
