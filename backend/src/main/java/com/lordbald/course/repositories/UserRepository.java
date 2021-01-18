package com.lordbald.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lordbald.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
