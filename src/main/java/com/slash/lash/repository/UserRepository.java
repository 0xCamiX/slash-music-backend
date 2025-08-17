package com.slash.lash.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slash.lash.model.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {
    
}
