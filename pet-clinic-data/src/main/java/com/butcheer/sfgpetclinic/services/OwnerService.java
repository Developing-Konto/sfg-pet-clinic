package com.butcheer.sfgpetclinic.services;

import com.butcheer.sfgpetclinic.model.Owner;

import java.util.Set;

/**
 * Created by Butcheer on 2019-02-28 13:12
 */
public interface OwnerService {

   Owner findByLastName(String lastName);

   Owner findById(Long id);

   Owner save(Owner owner);

   Set<Owner> findAll();


}
