package com.project.issuemanagement.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "issue")
@Data
@NoArgsConstructor // Boş constructor yaratıyor
@AllArgsConstructor // Tüm field lar kullanılarak oluşturulmuş constructor
@ToString
@EqualsAndHashCode
public class Issue extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "description", length = 400)
	private String description;

	@Column(name = "details", length = 4000)
	private String details;

	@Column(name = "date")
	private Date date;

	@Column(name = "issueStatus")
	@Enumerated(EnumType.STRING) // DB de bu verinin nasıl durmasını istiyoruz?
	private IssueStatus issueStatus;

	@JoinColumn(name = "assigneeUserId")
	@ManyToOne(optional = true, fetch = FetchType.LAZY) // Object oluşturulurken User object ataması opsiyonel
														// //FetchType.LAZY - select atılırken Join object yalnızca
														// getter ı çağrıldığında getirilsin
	private User assignee;

	@JoinColumn(name = "projectId")
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	private Project project;

}
