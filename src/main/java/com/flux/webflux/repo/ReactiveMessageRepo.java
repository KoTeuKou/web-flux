package com.flux.webflux.repo;

import com.flux.webflux.domain.Message;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface ReactiveMessageRepo extends ReactiveSortingRepository<Message, Long> {

    Flux<Message> findAllByDataContains(String data);
}
