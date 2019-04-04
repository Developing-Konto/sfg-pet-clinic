package com.butcheer.sfgpetclinic.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * Created by Butcheer on 2019-02-13 14:47
 */
@MappedSuperclass
public class Person extends BaseEntity {

   @Column(name = "first_name")
   private String firstName;

   @Column(name = "last_name")
   private String lastName;

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }
}
