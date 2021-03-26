package com.dogametal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dogametal.domain.User;

@Repository
//MongoRepository(Type first Entity and type of ID this case is String)
public interface UserRepository extends MongoRepository<User, String> {

}
