package io.springMVC.service;

import java.util.List;

import io.springMVC.entity.User;

public interface UserService {
	
	public List<User> findAll();
	
	public User findOne(String id);
	
	public User create(User usr);
	
	public User update(String id, User usr);
	
	public void delete(String id);
	
}
