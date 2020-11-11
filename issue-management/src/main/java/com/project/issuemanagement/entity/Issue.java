package com.project.issuemanagement.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "issue")
public class Issue extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "description", length = 400)
	private String description;
	
	@Column(name = "date")
	private Date date;
	
	@Column(name = "issueStatus")
	@Enumerated(EnumType.STRING)  //DB de bu verinin nasıl durmasını istiyoruz?
	private IssueStatus issueStatus;
}
