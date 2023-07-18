package com.kumar;

import java.io.IOException;

/**
 * @author RakeshKumar
 */

public class Exercise2 {
    public static void main(String[] args) throws IOException {
        //Use ReactiveSources.integerFlux and ReactiveSource.userFlux

        //1) Print all numbers in the ReactiveSources.integerFlux stream
       ReactiveSources.integerFlux().subscribe(num->System.out.println(num));

        //Print all users in the ReactiveSources.userFlux stream

        ReactiveSources.userFlux().subscribe(System.out::println);

       System.out.println("Press any key to end ");
        System.in.read();

    }
}
