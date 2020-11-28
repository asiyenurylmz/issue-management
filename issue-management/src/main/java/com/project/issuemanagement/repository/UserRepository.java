package com.project.issuemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.issuemanagement.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByUsername(String username);
}
