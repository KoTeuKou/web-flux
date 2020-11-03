package com.flux.webflux.controller;

import com.flux.webflux.domain.Message;
import com.flux.webflux.service.MessageService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/controller")
public class MainController {

    private final MessageService messageService;

    public MainController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping
    public Flux<Message> specifiedMessages(@RequestParam String field) {
        return messageService.getSpecifiedMessages(field)
                .switchIfEmpty(messageService.getAll())
                .take(5);
    }

    @GetMapping
    public Flux<Message> allMessages(@RequestParam(defaultValue = "5") Integer count) {
        return messageService.getAll()
                .take(count);
    }

    @PostMapping
    public Mono<Message> add (@RequestBody Message message) {
        return messageService.addOne(message);
    }
}