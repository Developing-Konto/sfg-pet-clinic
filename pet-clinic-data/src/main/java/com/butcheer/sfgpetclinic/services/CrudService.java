package com.butcheer.sfgpetclinic.services;

import java.util.Set;

/**
 * Created by Butcheer on 2019-03-01 12:56
 */
public interface CrudService<T, ID> {
   Set<T> findAll();

   T findById(ID id);

   T save(T object);

   void delete(T object);

   void deleteById(ID id);
}
