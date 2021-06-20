package com.company.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamMap {

    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);

        System.out.println(numbers);//[1, 2, 3, 4, 5, 6, 7]
        // Output should be         [3, 6, 9, 12, 15, 18, 21]

        List<Integer> output = numbers.stream().map(input -> input*3).collect(Collectors.toList());
        System.out.println("Output of mapping is "+output);
    }
}
