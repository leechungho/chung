package com.chung.basic.user.repository;

import com.chung.basic.user.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

}
