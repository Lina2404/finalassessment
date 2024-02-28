package com.Final.Assessment.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Final.Assessment.Model.User;
import com.Final.Assessment.Repository.UserRepository;


@Controller
public class UserController {

	    @Autowired
	    private UserRepository userRepository;

	    @RequestMapping("/")
	    public String index() {
	        return "index";
	    }

	    @PostMapping("/users")
	    public void createUser(@RequestBody User user) {
	        // Save user data to the database
	        userRepository.save(user);
	    }

	    private String generatePassword(String firstName, String middleName, String lastName) {
	        // Generate password: 2 chars from each name + 3-digit random numbers
	        String password = firstName.substring(0, 2) +
	                          middleName.substring(0, 2) +
	                          lastName.substring(0, 2) +
	                          String.format("%03d", (int) (Math.random() * 1000));
	        return password;
	    }
	}


