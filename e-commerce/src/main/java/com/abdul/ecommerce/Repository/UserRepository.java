package com.abdul.ecommerce.Repository;

import com.abdul.ecommerce.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
