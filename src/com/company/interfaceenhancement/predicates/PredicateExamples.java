package com.company.interfaceenhancement.predicates;

import java.util.function.Predicate;

public class PredicateExamples {

    public static void main(String[] args){
        Integer[] numbers = {2,6,9,4,8,22,19, 23, 11, 5};

        Predicate<Integer> oddEvenPredicate = num -> num % 2 != 0;

        for(Integer num: numbers){
            if(oddEvenPredicate.test(num)){
                System.out.println("Odd num "+num);
            }
            if(oddEvenPredicate.negate().test(num)){
                System.out.println("Even num "+num);
            }
        }

        // find all the odd numbers which are greater than 10
        Predicate<Integer> gt10Predicate = num -> num > 10;
        for(Integer num: numbers) {
            if (gt10Predicate.and(oddEvenPredicate).test(num)) {
                System.out.println("Odd num > 10: "+num);
            }
        }
        //Array of names will some empty string also in the array, remove all empty string
    }
}
