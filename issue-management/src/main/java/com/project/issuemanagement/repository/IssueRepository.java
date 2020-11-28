package com.project.issuemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.issuemanagement.entity.Issue;

public interface IssueRepository extends JpaRepository<Issue, Long>{

}
