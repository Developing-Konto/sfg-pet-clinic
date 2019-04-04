package com.butcheer.sfgpetclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Butcheer on 2019-02-13 14:50
 */
@Entity
@Table(name="types")
public class PetType extends BaseEntity {

   @Column(name = "name")
   private String name;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
}
