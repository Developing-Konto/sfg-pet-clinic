package com.butcheer.sfgpetclinic.services.map;

import com.butcheer.sfgpetclinic.model.BaseEntity;

import java.util.*;

/**
 * Created by Butcheer on 2019-03-01 13:10
 */
public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {// ?extends Long?

   protected Map< Long, T> map = new HashMap<>();

   Set<T> findAll() {
      return new HashSet<>(map.values());
   }

   T findById(ID id) {
      return map.get(id);
   }

   T save(T object) {
      if (object == null) {
         throw new RuntimeException("Object cannot be null");
      }
      if (object.getId() == null) {
         object.setId(getNextId());
      }
      map.put(object.getId(), object);
      return object;
   }

   void deleteById(ID id) {
      map.remove(id);
   }

   void delete(T object) {
      map.entrySet().removeIf(idtEntry -> idtEntry.getValue().equals(object));
   }


   private  Long getNextId() {

      return map.isEmpty() ? 1L : Collections.max(map.keySet()) + 1L;
   }

}
