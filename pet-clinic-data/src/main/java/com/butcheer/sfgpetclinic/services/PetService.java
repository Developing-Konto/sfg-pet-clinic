package com.butcheer.sfgpetclinic.services;

import com.butcheer.sfgpetclinic.model.Pet;

import java.util.Set;

/**
 * Created by Butcheer on 2019-02-28 13:16
 */
public interface PetService {
   Pet findById(Long id);

   Pet save(Pet pet);

   Set<Pet> findAll();
}
