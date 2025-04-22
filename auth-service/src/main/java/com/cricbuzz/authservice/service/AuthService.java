package com.cricbuzz.authservice.service;

import java.util.Optional;

import com.cricbuzz.authservice.Entity.UserCredential;
import com.cricbuzz.authservice.repository.UserCredentialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserCredentialRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtService jwtService;

    public String saveUser(UserCredential credential) {
        credential.setPassword(passwordEncoder.encode(credential.getPassword()));
        repository.save(credential);
        return "user Added to the system";
    }

    public String generateToken(String username) {
        return jwtService.generateToken(username);
    }

    public boolean checkIfUsernameIsPresent(String username) {
        Optional<UserCredential> userData = repository.findByName(username);
        return userData.isPresent();
    }

    public void validateToken(String token) {
        jwtService.validateToken(token);
    }

    public boolean checkIfEmailIsPresent(String email) {
        Optional<UserCredential> userData = repository.findByEmail(email);
        return userData.isPresent();
    }
}
