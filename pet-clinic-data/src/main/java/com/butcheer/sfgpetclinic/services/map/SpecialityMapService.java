package com.butcheer.sfgpetclinic.services.map;

import com.butcheer.sfgpetclinic.model.Speciality;
import com.butcheer.sfgpetclinic.services.SpecialtyService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Butcheer on 2019-03-29 13:10
 */
@Service
public class SpecialityMapService extends AbstractMapService<Speciality, Long>
   implements SpecialtyService {
   @Override
   public Set<Speciality> findAll() {
      return super.findAll();
   }

   @Override
   public void deleteById(Long id) {
      super.deleteById(id);
   }

   @Override
   public void delete(Speciality object) {
      super.delete(object);
   }

   @Override
   public Speciality save(Speciality object) {
      return super.save(object);
   }

   @Override
   public Speciality findById(Long id) {
      return super.findById(id);
   }
}
