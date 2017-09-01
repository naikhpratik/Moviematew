package io.springMVC.repository;

import java.util.List;

import io.springMVC.entity.User;

public interface UserRepository {

	public List<User> findAll();
	
	public User findOne(String id);
	
	public User findbyEmail(String email);
	
	public User create(User usr);
	
	public User update(User usr);
	
	public void delete(User usr);
	
}
