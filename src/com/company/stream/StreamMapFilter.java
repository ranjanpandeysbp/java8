package com.company.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapFilter {

    public static void main(String[] args){
        List<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Kiwi");
        fruits.add("Papaya");
        fruits.add("Grapes");


        // print length of every fruit
        System.out.println(fruits.stream().map(f -> f.length()).collect(Collectors.toList()));

        //find only those fruits whose length is greater than 5
        System.out.println(fruits.stream().filter(f -> f.length() > 5).collect(Collectors.toList()));

        //find fruits whose length greater than 5
        System.out.println(fruits.stream().filter(f -> f.length() > 5).map(f->f.length()).collect(Collectors.toList()));

        // How many fruits exist that have length greater than 5
        Long numOfFruitsWithLengthGT5 = fruits.stream().filter(f->f.length()>5).count();
        System.out.println(numOfFruitsWithLengthGT5);
    }
}
