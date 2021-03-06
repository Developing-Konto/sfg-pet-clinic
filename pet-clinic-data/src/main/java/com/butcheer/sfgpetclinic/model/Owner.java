package com.butcheer.sfgpetclinic.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Butcheer on 2019-02-13 14:48
 */
@Entity
@Table(name = "owners")
public class Owner extends Person {

   @Column(name = "addres")
   private String address;
   @Column(name = "city")
   private String city;
   @Column(name = "telephone")
   private String telephone;

   @OneToMany(cascade = CascadeType.ALL,  mappedBy = "owner" )
   private Set<Pet> pets = new HashSet<>();

   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public String getCity() {
      return city;
   }

   public void setCity(String city) {
      this.city = city;
   }

   public String getTelephone() {
      return telephone;
   }

   public void setTelephone(String telephone) {
      this.telephone = telephone;
   }

   public Set<Pet> getPets() {
      return pets;
   }

   public void setPets(Set<Pet> pets) {
      this.pets = pets;
   }
}
