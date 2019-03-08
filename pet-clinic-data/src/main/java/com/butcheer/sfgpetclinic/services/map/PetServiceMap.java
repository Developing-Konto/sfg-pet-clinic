package com.butcheer.sfgpetclinic.services.map;

import com.butcheer.sfgpetclinic.model.Pet;
import com.butcheer.sfgpetclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Butcheer on 2019-03-01 14:25
 */
@Service
public class PetServiceMap extends AbstractMapService<Pet, Long>
   implements PetService {
   @Override
   public Set<Pet> findAll() {
      return super.findAll();
   }

   @Override
   public void deleteById(Long id) {
      super.deleteById(id);
   }

   @Override
   public void delete(Pet object) {
      super.delete(object);
   }

   @Override
   public Pet save(Pet object) {
      return super.save(object.getId(), object);
   }

   @Override
   public Pet findById(Long id) {
      return super.findById(id);
   }
}