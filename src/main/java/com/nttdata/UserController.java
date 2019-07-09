package com.nttdata;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.entity.User;

@RestController
public class UserController {
	@Autowired
	UserService userService ;; //Dependency injection
	@PostMapping("/user") //REST end point
	public void create(@RequestBody User user) throws Exception{
		userService.createUser(user);
	}
	@PutMapping("/user/{id}")
	public void update(@RequestBody User user, @PathVariable("id") Long id) {
		userService.update(user, id);
	}
	@GetMapping("/user")
	public List<User> getUsers(){
		return userService.getUsers();
	}
	@GetMapping("/user/{id}")
	public Optional<User> getUser(@PathVariable("id") Long id){
		return userService.getUser(id);
	}
}
