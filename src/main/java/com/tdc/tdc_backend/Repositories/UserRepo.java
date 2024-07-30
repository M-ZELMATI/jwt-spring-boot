package com.tdc.tdc_backend.Repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.tdc.tdc_backend.Entities.Users;

import java.util.Optional;

public interface UserRepo extends JpaRepository<Users, Integer> {
    Optional<Users> findByEmail(String email);
}