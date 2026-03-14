package com.example.bancocn.reposteries;

import com.example.bancocn.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface userReposteries extends JpaRepository<User, Long> {
   Optional<User> findUserByDocumento(String documento);
   Optional<User> findUserById(String Id);

}
