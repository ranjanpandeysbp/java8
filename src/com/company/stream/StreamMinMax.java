package com.company.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMinMax {

    public static  void main(String args[]){

        List<Integer> numList = Arrays.asList(55,22,1,48,101,77);
        List<Integer> duplicateNumList = Arrays.asList(55,22,1,48,101,77,1,48,101,77);

        //Integer minVal = numList.stream().min((a,b)->{ return a.compareTo(b); }).get();
        //Integer maxVal = numList.stream().max((a,b)->{ return a.compareTo(b); }).get();

        Integer minVal = numList.stream().min(StreamMinMax::sortElements).get();
        Integer maxVal = numList.stream().max(StreamMinMax::sortElements).get();

        System.out.println("Min Value: "+minVal+" , "+"Max Value: "+maxVal);

        List<Integer> dupSortedList = duplicateNumList.stream().sorted().collect(Collectors.toList());
        System.out.println("dupSortedList: "+dupSortedList);

        List<Integer> distictSortedList = duplicateNumList.stream().sorted().distinct().collect(Collectors.toList());
        System.out.println("distictSortedList: "+distictSortedList);
    }

    public static Integer sortElements(Integer a, Integer b){
        return a.compareTo(b);
    }
}
