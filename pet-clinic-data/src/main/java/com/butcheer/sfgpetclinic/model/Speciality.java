package com.butcheer.sfgpetclinic.model;

/**
 * Created by Butcheer on 2019-03-25 13:37
 */
public class Speciality extends BaseEntity {

   private String description;

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }
}
