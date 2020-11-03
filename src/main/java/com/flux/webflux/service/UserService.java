package com.flux.webflux.service;

import com.flux.webflux.domain.User;
import com.flux.webflux.repo.UserRepo;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class UserService {
    private final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public Mono<User> findByUsername(String username) {
        return userRepo.findByUsername(username);
    }
}
