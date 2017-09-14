package com.boot.noteapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.noteapi.dao.UserDao;
import com.boot.noteapi.model.Note;
import com.boot.noteapi.model.User;
@Service
public class UserService {

	@Autowired
	UserDao userDao;
	
	public User findUser(String userID) {
		User user = userDao.findOne(userID);
		return user;
	}

	public void insertUser(User user) {
		System.out.println("in User service insert method");
		userDao.save(user);
		
	}

}
