package com.company.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPeekSkip {

    public static  void main(String args[]){
        List<String> flats = Arrays.asList("B01","B08","B11","T01","B01","B05","B01","B05","T07");
        List<String> flatsWithB = flats.stream().
                filter(flat-> flat.startsWith("B")).sorted().peek(System.out::println).distinct().skip(1).collect(Collectors.toList());
        //System.out.println(flatsWithB);
    }
}
