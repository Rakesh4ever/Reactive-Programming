package com.kumar;

import java.util.List;

/**
 * @author RakeshKumar created on 17/07/23
 */

public class Exercise3 {
    public static void main(String[] args) {
        // Use ReactiveSources.integerFlux
        //Get all numbers in the ReactiveSources.integerFlux stream into a list and list and size

       // ReactiveSources.integerFlux().toStream().forEach(System.out::println);

        List<Integer> integerList = ReactiveSources.integerFlux().toStream().toList();
        System.out.println("Flux data ::"+integerList + "  Of size "+integerList.size());
    }
}
