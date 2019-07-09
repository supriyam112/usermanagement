package com.nttdata;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nttdata.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
}
