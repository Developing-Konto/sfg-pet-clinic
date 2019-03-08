package com.butcheer.sfgpetclinic.services.map;

import com.butcheer.sfgpetclinic.model.Owner;
import com.butcheer.sfgpetclinic.services.CrudService;
import com.butcheer.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Butcheer on 2019-03-01 14:17
 */

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long>
   implements OwnerService  {
   @Override
   public Set<Owner> findAll() {
      return super.findAll();
   }

   @Override
   public void deleteById(Long id) {
      super.deleteById(id);
   }

   @Override
   public void delete(Owner object) {
      super.delete(object);
   }

   @Override
   public Owner save(Owner object) {
      return super.save(object.getId(), object);
   }

   @Override
   public Owner findById(Long id) {
      return super.findById(id);
   }

   @Override
   public Owner findByLastName(String lastName) {
      return null;
   }
}
