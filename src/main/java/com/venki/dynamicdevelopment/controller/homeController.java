package com.venki.dynamicdevelopment.controller;


import com.venki.dynamicdevelopment.Repository.home.content;
import com.venki.dynamicdevelopment.Repository.home.governingRepo;
import com.venki.dynamicdevelopment.Repository.home.partnerRepo;
import com.venki.dynamicdevelopment.Repository.home.staffRepo;
import com.venki.dynamicdevelopment.entity.home.home_content;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.LinkedList;


@Controller
public class homeController {
    @Autowired
    private staffRepo staf;
    @Autowired
    private content conten;

    @Autowired
    private governingRepo rep;
    @Autowired
    private content contents;
    @Autowired
    private partnerRepo ss;


    @RequestMapping(value = "search",method = RequestMethod.POST)
        public String search(@RequestParam String word,ModelMap modelMap)
    {
        String s = contents.findAll().get(0).getContent();
        if(s.contains(word))
        {
            modelMap.addAttribute("searchres",s);
            return "result";
        }
        s = "This Seminar was the first step of a UN system initiative aimed at supporting the Government of India Bamboo Development Plan, announced by the Prime Minister on World Environment Day, 5 June 1999. It resulted from a visit, in March, Mr. Carlos Magarinos, Director General         of UNIDO and was organized by the Ministry of Environment and Forests and UNIDO through a Regular budget project with technical and coordination support from UNDP, FAO and the International Network for Bamboo and Rattan (INBAR), based in Beijing, China. The seminar was oriented around six themes: resource  development, food processing and products, handicrafts, manufactured or industrial products, construction and energy and high-tech considerations in an effort to encompass all the most important development issues for this valuable raw material. The programme is shown as Annex 1, which, although not indicating exactly the actual timing, represents the format of alternating plenary and thematic sessions.";
        if(s.contains(word))
        {
            modelMap.addAttribute("searchres",s);
            return "result";
        }
        else
        {
            modelMap.addAttribute("searchres","NOT FOUNDED");
            return "result";
        }
    }

    @RequestMapping("/")
    public String homes(ModelMap modelMap) {
        modelMap.addAttribute("para", contents.findAll());
        return "index";
    }


    @RequestMapping("aboutcbtc")
    public String about() {
        return "aboutcbtc";
    }


    @RequestMapping("partner")
    public String partner(ModelMap modelMap) {
        modelMap.addAttribute("partner", ss.findAll());
        return "partner";
    }

    @RequestMapping("history")
    public String history() {
        return "history";
    }


    @RequestMapping("governing")
    public String governing(ModelMap modelMap) {
        modelMap.addAttribute("gov", rep.findAll());
        return "governing";
    }


    @RequestMapping("cbtcstaff")
    public String staff(ModelMap modelMap) {
        modelMap.addAttribute("staff", staf.findAll());
        return "cbtcstaff";
    }

    @RequestMapping("service")
    public String service() {
        return "service";
    }

    @RequestMapping("consultancy")
    public String consultancy() {
        return "consultancy";
    }


    @RequestMapping("admin")
    public String admin(HttpServletRequest req, ModelMap modelMap) {
        HttpSession session = req.getSession();
        if (session.getAttribute("username") != null) {
            modelMap.addAttribute("para", conten.findAll());
            return "admin";
        } else {
            return "login";
        }
    }

    @RequestMapping("Registration")
    public String regform(HttpServletRequest req) {
        HttpSession session = req.getSession();
        session.removeAttribute("result");
        return "Registration";
    }
}
