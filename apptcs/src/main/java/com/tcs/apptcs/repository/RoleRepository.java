package com.tcs.apptcs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tcs.apptcs.entity.*;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long>{

}
