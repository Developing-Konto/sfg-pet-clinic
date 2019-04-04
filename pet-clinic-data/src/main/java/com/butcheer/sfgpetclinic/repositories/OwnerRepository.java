package com.butcheer.sfgpetclinic.repositories;

import com.butcheer.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Butcheer on 2019-04-04 14:03
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
