package com.codejam.userservice.repository;

import com.codejam.userservice.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserDetailsRepository extends JpaRepository<UserDetails, Long> {
    UserDetails findByUserName(String userName);

    @Query("SELECT u.password FROM UserDetails As u  WHERE u.userName = ?1")
    String findPasswordByUserName(String userName);

    @Query("SELECT u.id FROM UserDetails As u  WHERE u.userName = ?1")
    Long findUserIdyUserName(String userName);

}
