package com.simplilearn.kitchenStory.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.kitchenStory.user.User1;

@Repository
public interface UserRepo extends JpaRepository<User1,Long>{

}
