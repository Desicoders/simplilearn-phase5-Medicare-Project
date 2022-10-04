package com.simplilearn.mediCare.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Status {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String StatusMsg;
	@CreationTimestamp
	LocalDateTime CreatedDatewithtime;
	
//	public Status(String msg)
//	{
//		this.StatusMsg=msg;
//	}
}
