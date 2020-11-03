package com.flux.webflux.repo;

import com.flux.webflux.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import reactor.core.publisher.Mono;

public interface UserRepo extends MongoRepository<User, Long> {
    Mono<User> findByUsername(String name);
}