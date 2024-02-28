package com.Final.Assessment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Final.Assessment.Model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
