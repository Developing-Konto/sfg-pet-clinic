package com.butcheer.sfgpetclinic.services;

import com.butcheer.sfgpetclinic.model.Owner;

/**
 * Created by Butcheer on 2019-02-28 13:12
 */


public interface OwnerService extends CrudService<Owner, Long> {

   Owner findByLastName(String lastName);



}
