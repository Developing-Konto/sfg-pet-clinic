package com.butcheer.sfgpetclinic.model;

import java.time.LocalDate;

/**
 * Created by Butcheer on 2019-02-13 14:49
 */
public class Pet {
   private LocalDate birthDate;
   private PetType petType;
   private Owner owner;

   public LocalDate getBirthDate() {
      return birthDate;
   }

   public void setBirthDate(LocalDate birthDate) {
      this.birthDate = birthDate;
   }

   public PetType getPetType() {
      return petType;
   }

   public void setPetType(PetType petType) {
      this.petType = petType;
   }

   public Owner getOwner() {
      return owner;
   }

   public void setOwner(Owner owner) {
      this.owner = owner;
   }
}
