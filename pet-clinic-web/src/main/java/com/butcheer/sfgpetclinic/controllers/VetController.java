package com.butcheer.sfgpetclinic.controllers;

import com.butcheer.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Butcheer on 2019-03-07 12:33
 */
@Controller
public class VetController {

   private final VetService vetService;

   public VetController(VetService vetService) {
      this.vetService = vetService;
   }

   @RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
   public String index(Model model) {
      model.addAttribute("vets", vetService.findAll());
      return "vets/index";
   }

}
