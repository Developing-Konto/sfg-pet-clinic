package com.butcheer.sfgpetclinic.model;

import java.io.Serializable;

/**
 * Created by Butcheer on 2019-02-28 13:29
 */
public class BaseEntity implements Serializable {

   private Long id;

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }
}
