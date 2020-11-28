package com.project.issuemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.issuemanagement.entity.IssueHistory;

public interface IssueHistoryRepository extends JpaRepository<IssueHistory, Long>{

}
