package com.flux.webflux.service;

import com.flux.webflux.domain.Message;
import com.flux.webflux.repo.ReactiveMessageRepo;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class MessageService {

    private final ReactiveMessageRepo reactiveMessageRepo;

    public MessageService(ReactiveMessageRepo reactiveMessageRepo) {
        this.reactiveMessageRepo = reactiveMessageRepo;
    }

    public Flux<Message> getAll() {
        return reactiveMessageRepo.findAll();
    }
    public Flux<Message> getSpecifiedMessages(String data) {
        return reactiveMessageRepo.findAllByDataContains(data);
    }

    public Mono<Message> addOne(Message message) {
        return reactiveMessageRepo.save(message);
    }
}
