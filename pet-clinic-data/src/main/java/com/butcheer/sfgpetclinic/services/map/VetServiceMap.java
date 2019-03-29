package com.butcheer.sfgpetclinic.services.map;

import com.butcheer.sfgpetclinic.model.Speciality;
import com.butcheer.sfgpetclinic.model.Vet;
import com.butcheer.sfgpetclinic.services.SpecialtyService;
import com.butcheer.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Butcheer on 2019-03-01 14:25
 */
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long>
   implements VetService {

   private final SpecialtyService specialtyService;

   public VetServiceMap(
      SpecialtyService specialtyService) {this.specialtyService = specialtyService;}


   @Override
   public Set<Vet> findAll() {
      return super.findAll();
   }

   @Override
   public void deleteById(Long id) {
      super.deleteById(id);
   }

   @Override
   public void delete(Vet object) {
      super.delete(object);
   }

   @Override
   public Vet save(Vet object) {

      if (object.getSpecialities().size() > 0) {
         object.getSpecialities().forEach(speciality -> {
            if (speciality.getId() == null) {
               Speciality savedSpeciality
                  = specialtyService.save(speciality);
               speciality.setId(savedSpeciality.getId());
            }

         });
      }


      return super.save(object);
   }

   @Override
   public Vet findById(Long id) {
      return super.findById(id);
   }
}
