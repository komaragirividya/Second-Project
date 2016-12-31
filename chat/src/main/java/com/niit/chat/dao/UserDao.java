package com.niit.chat.dao;

import java.util.List;

import com.niit.chat.model.User;

public interface UserDao 
{

	 public void addUser(User user);
	public User authenticate(User user);
	public void updateUser(User user);
	public User registerUser(User user);
	public List<User> userList();
	public List<User> getAllUsers(User user);
}
