package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entities.User.User;

public interface IUserRepo extends JpaRepository<User, Long>{
    
}
