package com.lvnt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.lvnt.model.User;

/**
 * Created by lvnt
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(@Param("email") String email);
    User findByUsername(@Param("username") String username);
}
