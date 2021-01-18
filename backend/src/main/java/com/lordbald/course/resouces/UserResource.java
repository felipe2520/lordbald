package com.lordbald.course.resouces;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lordbald.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	private ResponseEntity<User> findall(){
		User u = new User(1L, "maria", "maria@gmail.com", "1111111", "123");
		return ResponseEntity.ok().body(u);
	}
}
