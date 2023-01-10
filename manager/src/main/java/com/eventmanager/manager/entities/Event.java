package com.eventmanager.manager.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "events")
@Getter
@Setter
@NoArgsConstructor
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer eventId;
	
	@Column(name = "event_title", length = 100, nullable = false)
	private String title;
	
	@Column(length = 10000)
	private String content;
	
	private Date addedDate;
	
	private Date dateOfEvent;
	
	@ManyToOne
	private Organiser organiser;
//	
//	@OneToMany(mappedBy = "students", cascade = CascadeType.ALL)
//	private Set<Student> students = new HashSet<>();
}