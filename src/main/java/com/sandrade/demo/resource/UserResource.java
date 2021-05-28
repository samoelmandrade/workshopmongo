package com.sandrade.demo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sandrade.demo.domain.user;
import com.sandrade.demo.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	@Autowired
	private UserService service;
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<user>> findAll() {
		//List<user> list = new ArrayList<>();
		//user maria = new user("1001", "Maria Brown", "maria@gmail.com");
	//	user alex = new user("1002", "Alex Green", "alex@gmail.com");
	// samoel = new user("1003", "samoel maciel", "saoel@gmail.com");
	//	list.addAll(Arrays.asList(maria, alex,samoel));
		List<user> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
}
