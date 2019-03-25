package com.butcheer.sfgpetclinic.bootstrap;

import com.butcheer.sfgpetclinic.model.Owner;
import com.butcheer.sfgpetclinic.model.Pet;
import com.butcheer.sfgpetclinic.model.PetType;
import com.butcheer.sfgpetclinic.model.Vet;
import com.butcheer.sfgpetclinic.services.OwnerService;
import com.butcheer.sfgpetclinic.services.PetTypeService;
import com.butcheer.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * Created by Butcheer on 2019-03-08 12:53
 */
@Component
public class DataLoader implements CommandLineRunner {

   private final OwnerService ownerService;
   private final VetService vetService;
   private final PetTypeService petTypeService;


   public DataLoader(OwnerService ownerService,
                     VetService vetService,
                     PetTypeService petTypeService) {

      this.ownerService = ownerService;
      this.vetService = vetService;
      this.petTypeService = petTypeService;
   }


   @Override
   public void run(String... args) throws Exception {

      PetType dog = new PetType();
      dog.setName("Dog");
      PetType savedDogPetType = petTypeService.save(dog);

      PetType cat = new PetType();
      dog.setName("Cat");
      PetType savedCatPetType = petTypeService.save(cat);


      Owner owner1 = new Owner();
      owner1.setFirstName("Michael");
      owner1.setLastName("Weston");
      owner1.setAddress("123 Brickerel");
      owner1.setCity("Miami");
      owner1.setTelephone("1231231234");
      Pet mikesPet = new Pet();
      mikesPet.setPetType(savedDogPetType);
      mikesPet.setOwner(owner1);
      mikesPet.setBirthDate(LocalDate.of(2000, 12, 24));
      mikesPet.setName("RoscoDog");
      owner1.getPets().add(mikesPet);

      ownerService.save(owner1);

      Owner owner2 = new Owner();
      owner2.setFirstName("Fiona");
      owner2.setLastName("Glenanne");
      owner2.setAddress("123 Brickerel");
      owner2.setCity("Miami");
      owner2.setTelephone("1231231234");

      Pet fionnasPet = new Pet();
      fionnasPet.setPetType(savedCatPetType);
      fionnasPet.setOwner(owner2);
      fionnasPet.setBirthDate(LocalDate.now());
      fionnasPet.setName("JustCat");
      owner2.getPets().add(fionnasPet);


      ownerService.save(owner2);

      System.out.println("Loaded Owners....");

      Vet vet1 = new Vet();
      vet1.setFirstName("Sam");
      vet1.setLastName("Axe");

      vetService.save(vet1);

      Vet vet2 = new Vet();
      vet2.setFirstName("Jessie");
      vet2.setLastName("Porter");

      vetService.save(vet2);

      System.out.println("Loaded Vets....");
   }


}
