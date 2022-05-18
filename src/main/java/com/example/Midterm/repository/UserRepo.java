package com.example.Midterm.repository;

import com.example.Midterm.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    List<User> findByEmail(String email);
    @Query(value = "SELECT * FROM user WHERE user.email= :email", nativeQuery = true)
    List<User> emailCheck(String email);

    // Ad same for pass
}
