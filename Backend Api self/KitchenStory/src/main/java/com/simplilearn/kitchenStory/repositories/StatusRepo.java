package com.simplilearn.kitchenStory.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.kitchenStory.entities.Status;

public interface StatusRepo extends JpaRepository<Status, Long> {

}
