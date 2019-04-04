package com.butcheer.sfgpetclinic.model;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created by Butcheer on 2019-02-13 14:49
 */
@Entity
@Table(name = "pets")
public class Pet extends BaseEntity {

   @Column(name = "name")
   private String name;

   @Column(name = "birth_date")
   private LocalDate birthDate;

   @ManyToOne
   @JoinColumn(name="owner_id")
   private Owner owner;

   @ManyToOne
   @JoinColumn(name="type_id")
   private PetType petType;


   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

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
