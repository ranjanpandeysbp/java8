package com.company.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamColonOperator {

    public static void main(String[] args) {
        List<String> alphaNumerics = Arrays.asList("A11", "A44", "a22", "a49","G66");

        //List<String> strList = alphaNumerics.stream().map(i->i.toUpperCase()).filter(e->e.startsWith("A")).collect(Collectors.toList());
        //System.out.println(strList);

        //List<String> strList = alphaNumerics.stream().map(String :: toUpperCase).filter(e->e.startsWith("A")).collect(Collectors.toList());
        //System.out.println(strList);

        //filter is a lazy operation on stream
        /*alphaNumerics.stream().filter(input->{
            System.out.println(input);
            return input.startsWith("A");
        }).count();*/

        alphaNumerics.stream().map(String :: toUpperCase).filter(e->e.startsWith("A")).forEach(a->System.out.println(a));
        alphaNumerics.stream().map(String :: toUpperCase).filter(e->e.startsWith("A")).forEach(System.out::println);


    }
}
