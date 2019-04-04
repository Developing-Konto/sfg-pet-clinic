package com.butcheer.sfgpetclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Butcheer on 2019-03-25 13:37
 */
@Entity
@Table(name = "specialties")
public class Speciality extends BaseEntity {

   @Column(name = "description")
   private String description;

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }
}
