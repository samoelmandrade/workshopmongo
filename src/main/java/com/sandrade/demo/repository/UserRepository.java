package com.sandrade.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sandrade.demo.domain.user;

@Repository
public interface UserRepository extends MongoRepository<user, String> {
	

}
