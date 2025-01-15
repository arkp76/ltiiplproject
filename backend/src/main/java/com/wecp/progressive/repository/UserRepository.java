package com.wecp.progressive.repository;


<<<<<<< HEAD
import org.springframework.data.jpa.repository.JpaRepository;

import com.wecp.progressive.entity.User;

public interface UserRepository extends JpaRepository<User,Integer>{

    User findByUsername(String username);

    User findByEmail(String email);
=======
public interface UserRepository {
>>>>>>> f8df9d574a9e90305800176f3d27753e146d0d04
}
