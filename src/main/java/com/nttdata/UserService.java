package com.nttdata;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.nttdata.entity.User;

@Service
@Transactional(rollbackOn=Exception.class)
public class UserService {
	@Autowired
	UserRepository userRepository;
	public void createUser(User user) throws Exception {
//		if(user.getSalary() <1000) {
//			throw new IllegalArgumentException("Salary cannot be <1000");
//		}
		userRepository.save(user);
//		throw new Exception();
		
//		return "success";
	}

	public void update(User user, Long id ) {
		System.out.println("user="+user);
		//user.setId(id);
		userRepository.save(user);
	}

	public List<User> getUsers() {
		return userRepository.findAll();
	}

	public Optional<User> getUser(Long id) {
		return userRepository.findById(id);
	}
}
