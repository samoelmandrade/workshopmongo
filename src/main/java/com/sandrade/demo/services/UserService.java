package com.sandrade.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sandrade.demo.domain.user;
import com.sandrade.demo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	public List<user> findAll(){
		
		return repo.findAll();
		
	}
}
