package com.daniel.Gebiya.repo;

import com.daniel.Gebiya.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

    User findUserByUserId(Long userId);

    void deleteUserByUserId(Long userId);
}
