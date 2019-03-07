package com.butcheer.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Butcheer on 2019-03-07 12:56
 */
@RequestMapping("/owners")
@Controller
public class OwnerController {

   @RequestMapping({"", "/index" , "/index.html"})
   public String index(){
      return "owners/index";
   }
}
