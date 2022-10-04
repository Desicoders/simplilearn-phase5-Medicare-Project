package com.simplilearn.mediCare.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.mediCare.entities.Status;

public interface StatusRepo extends JpaRepository<Status, Long> {

}
