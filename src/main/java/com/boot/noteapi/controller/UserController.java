package com.boot.noteapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boot.noteapi.model.User;
import com.boot.noteapi.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/")
	public String welcomeUser(){
		return "Hello User Controller!";
	}
	@RequestMapping(value="/users/{userID}", method=RequestMethod.GET)
	public User getUser(@PathVariable String userID){
		return userService.findUser(userID);
	}
	@RequestMapping(value="/users", method=RequestMethod.POST)
	public User postUser(@RequestBody User user){
		System.out.println("In user controller");
		 userService.insertUser(user);
		 return userService.findUser(user.getUserID());
	}
	
}
