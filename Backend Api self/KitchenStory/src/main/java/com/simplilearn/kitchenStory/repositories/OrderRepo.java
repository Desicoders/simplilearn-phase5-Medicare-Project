package com.simplilearn.kitchenStory.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.kitchenStory.entities.Order1;
import com.simplilearn.kitchenStory.user.User1;
@Repository
public interface OrderRepo extends JpaRepository<Order1, Long> {

	List<Order1> findByUser1(User1 user1);
}
