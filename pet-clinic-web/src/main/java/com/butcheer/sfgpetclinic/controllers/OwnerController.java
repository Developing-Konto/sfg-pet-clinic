package com.butcheer.sfgpetclinic.controllers;

import com.butcheer.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Butcheer on 2019-03-07 12:56
 */
@RequestMapping("/owners")
@Controller
public class OwnerController {

   private final OwnerService ownerService;

   public OwnerController(OwnerService ownerService) {
      this.ownerService = ownerService;
   }

   @RequestMapping({"", "/index", "/index.html"})
   public String index(Model model) {
      model.addAttribute("owners", ownerService.findAll());


      return "owners/index";
   }


   @RequestMapping("/find")
   public String findOwners() {
      return "notimplemented";
   }
}
