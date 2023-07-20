package com.in28minutes.web.restservices.restfulwebservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.web.restservices.restfulwebservices.User.User;

public interface UserRepository extends JpaRepository <User, Integer> {

}
