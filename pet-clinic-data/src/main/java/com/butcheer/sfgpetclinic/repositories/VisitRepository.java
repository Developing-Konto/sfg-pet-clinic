package com.butcheer.sfgpetclinic.repositories;

import com.butcheer.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Butcheer on 2019-04-04 14:04
 */
public interface VisitRepository extends CrudRepository<Visit, Long> {
}
