package com.butcheer.sfgpetclinic.model;

/**
 * Created by Butcheer on 2019-02-13 14:50
 */
public class PetType extends BaseEntity {
   private String name;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
}
