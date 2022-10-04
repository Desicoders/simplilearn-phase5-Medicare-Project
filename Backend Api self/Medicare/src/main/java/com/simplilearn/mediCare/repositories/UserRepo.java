package com.simplilearn.mediCare.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.mediCare.user.User1;

@Repository
public interface UserRepo extends JpaRepository<User1,Long>{
	User1 findByIdAndPassword(long id,String password);

}
