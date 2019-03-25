package com.butcheer.sfgpetclinic.services.map;

import com.butcheer.sfgpetclinic.model.PetType;
import com.butcheer.sfgpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Butcheer on 2019-03-25 14:02
 */

@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {
   @Override
   public Set<PetType> findAll() {
      return super.findAll();
   }

   @Override
   public void deleteById(Long id) {
      super.deleteById(id);
   }

   @Override
   public void delete(PetType object) {
      super.delete(object);
   }


   @Override
   public PetType save(PetType object) {
      return super.save(object);
   }

   @Override
   public PetType findById(Long id) {
      return super.findById(id);
   }
}
