package com.venki.dynamicdevelopment.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
public class homeController {
    String res;

    @RequestMapping("/")
    public String homes(HttpServletRequest req) {
        HttpSession session = req.getSession();
        res = "Formerly knows as CBTC, NECBDC was incorporated with the objective of organizing the hitherto untapped bamboo sector of NE India which is a significant occupant of its topography, culture and customary practices since time immemorial. NECBDC involves its creativity and resource in talent scouting,  training, technology sourcing, market linkage for giving a new age thrust                       to the age old bamboo sector. Keeping in mind the fast track changes in the global marketplace,\n" + "                            contemporizing the traditional presentational aesthetics of bamboo end products receives our priority.\n" + "                            In this never ending endeavor of NECBDC to unleash a new dimension to bamboo of North East, we have set\n" + "                            a benchmark to measure our impact. Unfailingly the apex index of our benchmark is: how many more homes\n" + "                            did we add today to the bamboo grove of happiness and prosperity!Formerly knows as CBTC, NECBDC was incorporated with the objective of organizing the hitherto untapped bamboo sector of NE India which is a significant occupant of its\n" + "                            topography, culture and customary practices since time immemorial. NECBDC involves its creativity and\\n\n" + "                            resource in talent scouting, training, technology sourcing, market linkage for giving a new age thrust \n" + "                            to the age old bamboo sector. Keeping in mind the fast track changes in the global marketplace,\n" + "                            contemporizing the traditional presentational aesthetics of bamboo end products receives our priority.\n" + "                            In this never ending endeavor of NECBDC to unleash a new dimension to bamboo of North East, we have set\n" + "                            a benchmark to measure our impact. Unfailingly the apex index of our benchmark is: how many more homes\n" + "                            did we add today to the bamboo grove of happiness and prosperity!";
        session.setAttribute("para", res);
        return "index";
    }

    @RequestMapping("aboutcbtc")
    public String about() {
        return "aboutcbtc";
    }

    @RequestMapping("partner")
    public String partner() {
        return "partner";
    }

    @RequestMapping("history")
    public String history() {
        return "history";
    }

    @RequestMapping("governing")
    public String governing() {
        return "governing";
    }

    @RequestMapping("cbtcstaff")
    public String staff() {
        return "cbtcstaff";
    }


}
