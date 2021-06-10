package com.company.interfaceenhancement.predicates;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateDemoMainJava8 {

    public static void main(String[] args){
        //Predicate<Integer> predicate = (Integer age) -> {return age>18; };
        Predicate<Integer> predicate = age -> age>18;
        System.out.println(predicate.test(20));

        ArrayList<String> names = new ArrayList<>();

        //Predicate<ArrayList> predicate1 = (ArrayList list)-> {return list.isEmpty();};
        Predicate<ArrayList> predicate1 = list-> list.isEmpty();
        System.out.println(predicate1.test(names));

        names.add("John");
        System.out.println(predicate1.test(names));
    }
}
