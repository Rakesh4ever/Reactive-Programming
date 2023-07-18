package com.kumar;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

/**
 * @author RakeshKumar created on 18/07/23
 */

public class ReactiveSources {
    public static Flux<String> stringNumbersFlux(){
        return Flux.just("One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten")
                .delayElements(Duration.ofSeconds(1));

    }
    public static Flux<Integer> integerFlux(){
        return  Flux.range(1,10)
                .delayElements(Duration.ofSeconds(1));
    }
    public static Flux<Integer> intNumbersFluxWithException(){
        return Flux.range(1,10)
                .delayElements(Duration.ofSeconds(1))
                .map(e->{
                    if(e==5) throw new RuntimeException("An error happens in the flux");
                    return e;
                });
    }
    public static Mono<Integer> intNumberMono(){
        return Mono.just(42)
                .delayElement(Duration.ofSeconds(1));
    }

    public static Flux<Integer> intNumbersFlux(){
        return Flux.range(1,10)
                .delayElements(Duration.ofSeconds(1));
    }

    public static Flux<User> userFlux(){
        return Flux.just(
                new User(1,"Lionel","Messi"),
                new User(2,"Crystiano","Ronaldo"),
                new User(3,"Diego","Maradona"),
                new User(4,"Zinedine","Zidane"),
                new User(5,"Rakesh","Kumar")

        ).delayElements(Duration.ofSeconds(1));
    }
}
