package com.venki.dynamicdevelopment.controller;


import com.venki.dynamicdevelopment.Repository.home.governingRepo;
import com.venki.dynamicdevelopment.Repository.home.partnerRepo;
import com.venki.dynamicdevelopment.Repository.home.staffRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class AdminhomeController {

    @Autowired
    private partnerRepo res;
    @RequestMapping("adminpartner")
    public String partner(ModelMap modelMap)
    {
        modelMap.addAttribute("partner", res.findAll());
        return "adminpartner";
    }

    @Autowired
    private governingRepo rep;
    @RequestMapping("admingoverning")
    public String governing(ModelMap modelMap) {
        modelMap.addAttribute("gov", rep.findAll());
        return "admingoverning";
    }

    @Autowired
    private staffRepo staf;
    @RequestMapping("admincbtcstaff")
    public String staff(ModelMap modelMap) {
        modelMap.addAttribute("staff", staf.findAll());
        return "admincbtcstaff";
    }

    @RequestMapping("adminservice")
    public String service() {
        return "adminservice";
    }

    @RequestMapping("adminconsultancy")
    public String consultancy() {
        return "adminconsultancy";
    }

}
