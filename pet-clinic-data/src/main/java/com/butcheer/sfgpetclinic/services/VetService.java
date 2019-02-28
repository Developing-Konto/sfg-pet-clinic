package com.butcheer.sfgpetclinic.services;

import com.butcheer.sfgpetclinic.model.Vet;

import java.util.Set;

/**
 * Created by Butcheer on 2019-02-28 13:17
 */
public interface VetService {
   Vet findById(Long id);

   Vet save(Vet vet);

   Set<Vet> findAll();

}
