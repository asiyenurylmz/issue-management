package com.project.issuemanagement.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.project.issuemanagement.entity.Issue;

public interface IssueService {

	Issue save(Issue issue);
	
	Issue getById(Long id);
	
	Page<Issue> getAllPageable(Pageable pageable);
	
	Boolean delete(Long issueId);
}
