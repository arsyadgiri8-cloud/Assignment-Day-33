package com.bootcamp.assignmentday33.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bootcamp.assignmentday33.entity.User;

public interface UserRepository extends JpaRepository<User,Long>{
}
