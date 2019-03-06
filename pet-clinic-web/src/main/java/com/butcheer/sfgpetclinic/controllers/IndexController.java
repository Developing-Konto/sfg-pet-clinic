package com.butcheer.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Butcheer on 2019-03-06 14:43
 */
@Controller
public class IndexController {

   @RequestMapping({"", "/", "index", "index.html"})
   public String index() {

      return "index";
   }
}
