package examples;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class MainExamples {
    public static void main(String[] args) {
        //      Примеры инициализации
//        Из набора значений:
//        Flux<String> sequence = Flux.just("one", "two", "three");
//        Из списка:
//        List<String> iterable = Arrays.asList("one", "two", "three");
//        Flux<String> sequence = Flux.fromIterable(iterable);
//        Диапазон значений, начальное и количество элементов включая начальный:
//        Flux<Integer> numbersFromOneToFive = Flux.range(1, 5);
//        Пустой flux:
//        Flux<Object> empty = Flux.empty();
//        Mono<String> noData = Mono.empty();  //пустой Mono
//        Из элемента
//        Mono<String> data = Mono.just("one");
//
//        Способы подписаться:
//        subscribe();  //запустить исполнение..
//
//           .. и сделать что-то с каждым полученным значением
//        subscribe(Consumer<? super T> consumer);
//
//          .. и сделать что-то в случае исключения
//        subscribe(Consumer<? super T> consumer, Consumer<? super Throwable> errorConsumer);
//
//           .. и сделать что-то по завершению
//        subscribe(
//          Consumer<? super T> consumer,
//          Consumer<? super Throwable> errorConsumer,
//           Runnable completeConsumer);
//
//      Пример:
//        Flux<Integer> ints = Flux.range(1, 5);
////            .map(i -> {
////            if (i <= 3) {
////                return i;
////            }
////            throw new RuntimeException("Exception??");
////        });
//        ints.subscribe(System.out::println,
//                error -> System.err.println("Error " + error),
//                () -> {System.out.println("Done");
//         });
//
    }
}
