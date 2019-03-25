package com.butcheer.sfgpetclinic.model;

import java.util.Set;

/**
 * Created by Butcheer on 2019-02-13 14:48
 */
public class Owner extends Person {

   private Set<Pet> pets;

   public Set<Pet> getPets() {
      return pets;
   }

   public void setPets(Set<Pet> pets) {
      this.pets = pets;
   }
}
