package com.company.interfaceenhancement.predicates;

import java.util.function.Predicate;

public class PredicateExampleIsEqual {

    public static void main(String[] args){
        String name = "John h";

        Predicate<String> nameEqualityPredicate = Predicate.isEqual("John");

        System.out.println(nameEqualityPredicate.test(name));
    }
}
