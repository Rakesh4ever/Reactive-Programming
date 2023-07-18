package com.kumar;

import java.util.stream.Collectors;

public class Exercise1 {
    public static void main(String[] args) {
        //print all numbers from the numbersStream

        StreamSources.numberStream().forEach(s->System.out.println(s));
        //print all numbers from the numbersStream that are less than 5

        StreamSources.numberStream().filter(s->s<5).forEach(s->System.out.println(s));

        //Print the 2nd and 3rd numbers in numberStream that's greater than 5

        StreamSources.numberStream().filter(s->s>5).skip(1).limit(2).forEach(number->System.out.println((number)));

        //print first element from the numbersStream that are greater than 5 if nothing is found return -1
 int value=  StreamSources.numberStream().filter(s->s>5)
                .findFirst()
                .orElse(-1);
 System.out.println(value);


        //print all first name of all users

        StreamSources.userStream().map(user->user.getFirstName())
                .forEach(name->System.out.println(name));

        //Print the first name in userStream for user that have ids from numberStream
        StreamSources.numberStream().flatMap(num->StreamSources.userStream().filter(user->user.getUserId()==num))
                .map(u->u.getFirstName()) // If stream will return single value then use map. If Stream will return substream then use flatMap
                .forEach(userName->System.out.println(userName));

    }
}
