package com.butcheer.sfgpetclinic.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Butcheer on 2019-02-13 14:48
 */
public class Vet extends Person {

   private Set<Speciality> specialities = new HashSet<>();

   public Set<Speciality> getSpecialities() {
      return specialities;
   }

   public void setSpecialities(Set<Speciality> specialities) {
      this.specialities = specialities;
   }
}
