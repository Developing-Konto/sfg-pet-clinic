package com.butcheer.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Butcheer on 2019-03-07 12:33
 */
@Controller
public class VetController {

   @RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
   public String index() {
      return "vets/index";
   }

}
