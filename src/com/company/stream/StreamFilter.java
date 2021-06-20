package com.company.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilter {

    public static void main(String[] a){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);

        System.out.println(numbers);//[1, 2, 3, 4, 5, 6, 7]
        //Until Java 7 - Odd numbers

        List<Integer> oddNumbers = new ArrayList<>();
        for (Integer num : numbers) {
            if(num%2 !=0 ){
                oddNumbers.add(num);
            }
        }
        System.out.println(oddNumbers);//[1, 3, 5, 7]

        //Java 8 - streams
        //Stream<Integer> stream = numbers.stream();
        //oddNumbers = numbers.stream().filter(num -> num%2 != 0).collect(Collectors.toList());
        Predicate<Integer> oddEvenPredicate = num -> num % 2 != 0;
        oddNumbers = numbers.stream().filter(oddEvenPredicate).collect(Collectors.toList());
        System.out.println("Odd numbers using Java-8 Stream: "+oddNumbers);
    }
}
