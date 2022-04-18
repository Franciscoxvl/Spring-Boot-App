package com.tcs.apptcs.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tcs.apptcs.entity.*;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	

}
