package com.butcheer.sfgpetclinic.services.map;

import com.butcheer.sfgpetclinic.model.Vet;
import com.butcheer.sfgpetclinic.services.CrudService;
import com.butcheer.sfgpetclinic.services.VetService;

import java.util.Set;

/**
 * Created by Butcheer on 2019-03-01 14:25
 */
public class VetServiceMap extends AbstractMapService<Vet, Long>
   implements VetService {
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
      return super.save(object.getId(), object);
   }

   @Override
   public Vet findById(Long id) {
      return super.findById(id);
   }
}
