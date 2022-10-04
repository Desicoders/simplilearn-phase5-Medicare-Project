package com.simplilearn.kitchenStory.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Status {

	@Id
	Long id;
	String StatusMsg;
	@CreationTimestamp
	LocalDateTime CreatedDatewithtime;
}