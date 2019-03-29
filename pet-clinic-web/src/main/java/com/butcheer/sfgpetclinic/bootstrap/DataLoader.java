package com.butcheer.sfgpetclinic.bootstrap;

import com.butcheer.sfgpetclinic.model.*;
import com.butcheer.sfgpetclinic.services.OwnerService;
import com.butcheer.sfgpetclinic.services.PetTypeService;
import com.butcheer.sfgpetclinic.services.SpecialtyService;
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
   private final SpecialtyService specialtyService;


   public DataLoader(OwnerService ownerService,
                     VetService vetService,
                     PetTypeService petTypeService,
                     SpecialtyService specialtyService) {

      this.ownerService = ownerService;
      this.vetService = vetService;
      this.petTypeService = petTypeService;
      this.specialtyService = specialtyService;
   }


   @Override
   public void run(String... args) throws Exception {

      if (petTypeService.findAll().size() == 0)
         loadData();
   }

   private void loadData() {
      PetType dog = new PetType();
      dog.setName("Dog");
      PetType savedDogPetType = petTypeService.save(dog);

      PetType cat = new PetType();
      dog.setName("Cat");
      PetType savedCatPetType = petTypeService.save(cat);

      Speciality radiology = new Speciality();
      radiology.setDescription("Radiology");
      Speciality saveRadiology = specialtyService.save(radiology);

      Speciality surgery = new Speciality();
      surgery.setDescription("Surgery");
      Speciality saveSurgery = specialtyService.save(surgery);

      Speciality dentistry = new Speciality();
      dentistry.setDescription("Dentistry");
      Speciality saveDentistry = specialtyService.save(dentistry);


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


      Vet vet1 = new Vet();
      vet1.setFirstName("Sam");
      vet1.setLastName("Axe");
      vet1.getSpecialities().add(saveRadiology);
      vetService.save(vet1);

      Vet vet2 = new Vet();
      vet2.setFirstName("Jessie");
      vet2.setLastName("Porter");
      vet2.getSpecialities().add(saveSurgery);

      vetService.save(vet2);

      System.out.println("Loaded Vets....");


//      vetService.findAll().forEach(vet -> {
//         StringBuilder out = new StringBuilder();
//         out.append(vet.getId()).append(" ").append(vet.getFirstName()).append(" ")
//            .append(vet.getLastName()).append(" ");
//
//         vet.getSpecialities()
//            .forEach(speciality ->
//                        out.append(speciality.getId()).append(" ")
//                           .append(speciality.getDescription()));
//
//         System.out.println(out);
//
//      });


   }


}
