package com.kumar;

import java.util.stream.Stream;

public class StreamSources {

    public static Stream<String> stringNumbersStream(){
        return Stream.of("one","two","three","four","five","six");
    }
    public static Stream<Integer> numberStream(){
        return Stream.iterate(0,i->i+2).limit(10);
    }

    public static Stream<User> userStream(){
        return Stream.of(
                new User(1,"Lionel","Messi"),
                        new User(2,"Crystiano","Ronaldo"),
                        new User(3,"Diego","Maradona"),
                        new User(4,"Zinedine","Zidane"),
                        new User(5,"Rakesh","Kumar")

        );
    }
}
