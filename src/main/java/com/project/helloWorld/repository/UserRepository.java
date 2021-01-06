package com.project.helloWorld.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.helloWorld.model.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long>{}
