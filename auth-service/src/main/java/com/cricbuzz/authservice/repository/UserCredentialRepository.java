package com.cricbuzz.authservice.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cricbuzz.authservice.Entity.UserCredential;

public interface UserCredentialRepository extends JpaRepository<UserCredential, Integer>{
    Optional<UserCredential> findByName(String username);

    Optional<UserCredential> findByEmail(String email);
}
