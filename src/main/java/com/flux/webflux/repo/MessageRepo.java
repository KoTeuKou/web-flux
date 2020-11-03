package com.flux.webflux.repo;

import com.flux.webflux.domain.Message;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MessageRepo extends MongoRepository<Message, Long> {

    List<Message> findAllByData(String data);
}
