package pga.com.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pga.com.api.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
  
}
