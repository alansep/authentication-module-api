package com.alansep.authenticationmodule.repository;

import com.alansep.authenticationmodule.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    int countByUsername(String username);
}
