package io.springMVC.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import io.springMVC.entity.User;

@Repository
public class UserRepositoryImplementation implements UserRepository{

	@Override
	public List<User> findAll() {
		return null;
	}

	@Override
	public User findOne(String id) {
		return null;
	}

	@Override
	public User create(User usr) {
		return null;
	}

	@Override
	public User update(User usr) {
		return null;
	}

	@Override
	public void delete(User usr) {
		
	}

	@Override
	public User findbyEmail(String email) {
		return null;
	}

}
