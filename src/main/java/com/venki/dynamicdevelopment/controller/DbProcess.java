package com.venki.dynamicdevelopment.controller;


import com.venki.dynamicdevelopment.Repository.RegistrationRepository;
import com.venki.dynamicdevelopment.entity.loginvalidation;
import com.venki.dynamicdevelopment.entity.registration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.LinkedList;
import java.util.List;

@Controller
public class DbProcess {
    @Autowired
    private RegistrationRepository Regs;

    @RequestMapping(value = "Registration", method = RequestMethod.POST)
    public String registration(@ModelAttribute registration reg, HttpServletRequest req) {
        List<registration> res = Regs.findByMailid(reg.getMailid());
        if (res.isEmpty()) {
            Regs.save(reg);
        }
        return "redirect:login";
    }

    //logout
    @RequestMapping("logout")
    public String logout(HttpServletRequest req) {
        HttpSession session = req.getSession();
        session.removeAttribute("username");
        return "redirect:/";
    }



    @RequestMapping(value = "admin", method = RequestMethod.POST)
    public String loginvalidation(ModelMap modelMap, @ModelAttribute loginvalidation logindata, HttpServletRequest req) {
        String mailId = logindata.getMail();
        LinkedList<registration> reg = Regs.findByMailid(mailId);
        if (!reg.isEmpty() && logindata.getPassword().equals(reg.get(0).getPassword())) {
            HttpSession session = req.getSession();
            session.setAttribute("username", reg.get(0).getUsername());
            return "redirect:admin";
        } else {
            modelMap.addAttribute("a","INVALID USERNAME OR PASSWORD");
            return "login";
        }
    }
}
