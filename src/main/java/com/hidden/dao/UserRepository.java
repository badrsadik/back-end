package com.hidden.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hidden.entities.User;

public interface UserRepository extends MongoRepository<User, Long> {

}
