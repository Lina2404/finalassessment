package com.Final.Assessment.Model;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
//User.java
@Entity
public class User {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;

	 private String firstName;
	 private String middleName;
	 private String lastName;
	 private String password;
	public String getFirstName() {
		// TODO Auto-generated method stub
		return null;
	}

}


