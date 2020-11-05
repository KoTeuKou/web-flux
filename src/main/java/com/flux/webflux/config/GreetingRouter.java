package com.flux.webflux.config;

import com.flux.webflux.handlers.GreetingHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.*;

public class GreetingRouter {

    @Bean
    public RouterFunction<ServerResponse> route(GreetingHandler greetingHandler) {
        RequestPredicate route = RequestPredicates
                .GET("/hello")
                .and(RequestPredicates.accept(MediaType.TEXT_PLAIN));

        return RouterFunctions
                .route(route, greetingHandler::hello)
                .andRoute(
                        RequestPredicates.GET("/"),
                        greetingHandler::index
                );
    }
}
