package com.venki.dynamicdevelopment.database;


import com.venki.dynamicdevelopment.Repository.RegistrationRepository;
import com.venki.dynamicdevelopment.entity.registration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class DbProcess
{
        @Autowired
        private RegistrationRepository Regs;

        @RequestMapping(value = "Registration", method = RequestMethod.POST)
        @ResponseBody
        public String registration(@ModelAttribute registration reg, HttpServletRequest req) {
           List<registration> res = Regs.findByMailid(reg.getMailid());
            if(res.isEmpty()){
                Regs.save(reg);
                return "sucussfull";
            }
            else
            {
            return "popup";
            }
        }



//    @RequestMapping(value = "login",method = RequestMethod.POST)
//    public String loginvalidation(@ModelAttribute loginvalidation logindata , HttpServletRequest req)
//    {
//       Regs.f
//    }
}
