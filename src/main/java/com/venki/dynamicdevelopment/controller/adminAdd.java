package com.venki.dynamicdevelopment.controller;


import com.venki.dynamicdevelopment.Repository.home.content;
import com.venki.dynamicdevelopment.Repository.home.governingRepo;
import com.venki.dynamicdevelopment.Repository.home.partnerRepo;
import com.venki.dynamicdevelopment.Repository.home.staffRepo;
import com.venki.dynamicdevelopment.entity.home.governing;
import com.venki.dynamicdevelopment.entity.home.home_content;
import com.venki.dynamicdevelopment.entity.home.partner;
import com.venki.dynamicdevelopment.entity.home.staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class adminAdd {

    @Autowired
    private content contents;

    @RequestMapping(value = "homeAddContent", method = RequestMethod.POST)
    public String homeAddContent(@RequestParam String content) {
        home_content con = home_content.builder().content(content).build();
        contents.save(con);
        return "redirect:admin";
    }

    @RequestMapping(value = "homeDeleteContent", method = RequestMethod.GET)
    public String homeDeleteContent(@RequestParam long id) {
        contents.deleteById(id);
        return "redirect:admin";
    }

    @Autowired
    private partnerRepo ss;

    @RequestMapping(value = "partnerAddContent", method = RequestMethod.POST)
    public String partnerAddContent(@RequestParam String content) {
        partner con = partner.builder().content(content).build();
        ss.save(con);
        return "redirect:adminpartner";
    }

    @RequestMapping(value = "partnerDeleteContent", method = RequestMethod.GET)
    public String partnerDeleteContent(@RequestParam long id) {
        ss.deleteById(id);
        return "redirect:adminpartner";
    }

    @Autowired
    private governingRepo gov;

    @RequestMapping(value = "govAddContent", method = RequestMethod.POST)
    public String govAddContent(@RequestParam String content,String position) {
        governing cons = governing.builder().content(content).position(position).build();
        gov.save(cons);
        return "redirect:admingoverning";
    }

    @RequestMapping(value = "govDeleteContent", method = RequestMethod.GET)
    public String govDeleteContent(@RequestParam long id) {
        gov.deleteById(id);
        return "redirect:admingoverning";
    }

    @Autowired
    private staffRepo staffs;

    @RequestMapping(value = "staffAddContent", method = RequestMethod.POST)
    public String staffAddContent(@RequestParam String content, String position,String contact) {
        staff cons = staff.builder().content(content).position(position).contact(contact).build();
        staffs.save(cons);
        return "redirect:admincbtcstaff";
    }

    @RequestMapping(value = "staffDeleteContent", method = RequestMethod.GET)
    public String staffDeleteContent(@RequestParam long id) {
       staffs.deleteById(id);
        return "redirect:admincbtcstaff";
    }
}
