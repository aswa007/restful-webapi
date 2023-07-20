package com.in28minutes.web.restservices.restfulwebservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.web.restservices.restfulwebservices.User.Post;

public interface PostRepository extends JpaRepository <Post, Integer> {

}
