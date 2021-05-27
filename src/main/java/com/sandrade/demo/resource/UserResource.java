package com.sandrade.demo.resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.sandrade.demo.domain.user;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<user>> findAll() {
		List<user> list = new ArrayList<>();
		user maria = new user("1001", "Maria Brown", "maria@gmail.com");
		user alex = new user("1002", "Alex Green", "alex@gmail.com");
		user samoel = new user("1003", "samoel maciel", "saoel@gmail.com");
		list.addAll(Arrays.asList(maria, alex,samoel));
		return ResponseEntity.ok().body(list);
	}
}
