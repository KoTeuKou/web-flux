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

    @GetMapping("/spec")
    public Flux<Message> specifiedMessages(@RequestParam String data) {
        return messageService.getSpecifiedMessages(data)
                .switchIfEmpty(messageService.getAll())
                .take(5);
    }

    @GetMapping("/all")
    public Flux<Message> allMessages(@RequestParam(defaultValue = "5") Integer count) {
        return messageService.getAll()
                .take(count);
    }

    @PostMapping("/add")
    public Mono<Message> add(@RequestParam String data) {
        return messageService.addOne(new Message(data));
    }
}