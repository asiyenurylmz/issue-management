package com.project.issuemanagement.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.project.issuemanagement.entity.Project;


public interface ProjectRepository extends JpaRepository<Project, Long>{
	
	List<Project> getAllByProjectCode(String projectCode);
	
	List<Project> getByProjectCodeContains(String projectCode);
	
	List<Project> getAllByProjectCodeAndIdNotNull(String projectCode);
	
	Page<Project> findAll(Pageable pageable);
	
	List<Project> findAll(Sort sort);
	
	

}
