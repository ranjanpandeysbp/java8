package com.company.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExtras {

    public static  void main(String args[]){
        int[] a = {2,4,6,1,4,5};
        //double
        //long

        IntStream is = Arrays.stream(a);//this method of converting to stream only works for primitive int, double, long

        Stream s1 = Stream.of(a);

        Stream s2 = Stream.of(2,4,2,1,5);
        Stream s3 = Stream.of(12,41,21,1,5);

        Stream s4 = Stream.concat(s2,s3).distinct();

        //s4.forEach(System.out::println);

        //range of numbers from stream
        IntStream stream2_10 = IntStream.range(2,11); //11 will be excluded
        stream2_10.forEach(value -> {System.out.print(" "+value);});
        System.out.println();
        IntStream stream2_11 = IntStream.rangeClosed(2,11); //11 will be included
        stream2_11.forEach(value -> {System.out.print(" "+value);});
    }
}
