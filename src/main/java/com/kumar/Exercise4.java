package com.kumar;

import java.io.IOException;

/**
 * @author RakeshKumar created on 18/07/23
 */

public class Exercise4 {
    public static void main(String[] args) throws IOException {
        //Use ReactiveSources.intNumberMono()
        // Print the value from intNumberMono() when it emits
        ReactiveSources.intNumberMono().subscribe(System.out::println);

        System.out.println("Press any key to end ");
        System.in.read();
    }
}
