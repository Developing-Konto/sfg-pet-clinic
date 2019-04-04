package com.butcheer.sfgpetclinic.repositories;

import com.butcheer.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Butcheer on 2019-04-04 14:04
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}
