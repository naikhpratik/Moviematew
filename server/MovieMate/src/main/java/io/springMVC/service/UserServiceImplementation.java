package io.springMVC.service;

import java.util.List;

import org.springframework.stereotype.Service;

import io.springMVC.entity.User;
import io.springMVC.exception.UserAlreadyExistsException;
import io.springMVC.exception.UserNotFoundException;
import io.springMVC.repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService{

	UserRepository repository;
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public User findOne(String id) {
		
		User existing = repository.findOne(id);
		if(existing == null){
			throw new UserNotFoundException("User with id: " + id +" not found");
		}
		return existing;
	}

	@Override
	public User create(User usr) {
		
		User existing = repository.findbyEmail(usr.getEmail());
		if(existing != null){
			throw new UserAlreadyExistsException(usr.getEmail()+"  Email already Exists");
		}
		return repository.create(usr) ;
	}

	@Override
	public User update(String id, User usr) {
		
		User existing = repository.findOne(id);
		if(existing == null){
			throw new UserNotFoundException("User with id: " + id +" not found");
		}
		return repository.update(usr);
	}

	@Override
	public void delete(String id) {
		
		User existing = repository.findOne(id);
		if(existing == null){
			throw new UserNotFoundException("User with id: " + id +" not found ");
		}
		repository.delete(existing);;
	}
	
	
	
}
