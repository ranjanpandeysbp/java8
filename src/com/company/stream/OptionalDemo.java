package com.company.stream;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

    public static void main(String args[]) throws RuntimeException{

        List<String> flats = Arrays.asList("B01", "B08", "B11", "T01", "B01", "B05", "B01", "B05", "T07");
        Optional<String> result = flats.stream().filter(flat->flat.startsWith("Y")).findFirst();

        /*if(result.isPresent()){
            System.out.println(result.get());
        }else {
            System.out.println("no result found");
        }*/

        //result.ifPresent(data->System.out.println(data));
        result.ifPresent(System.out::println);
        System.out.println(result.orElse("no data found in orElse"));
        String output = result.orElseGet(()->{return "no data";});
        System.out.println(output);
        //result.orElseThrow(()->{return new RuntimeException();});
        //result.orElseThrow(()->new RuntimeException());

        Optional<String> opt1 = Optional.of("Java is awesome");
        System.out.println(opt1);
        System.out.println(opt1.get());//Java is awesome

        String name = null;
        Optional<String> opt2 = Optional.ofNullable(name);//return empty for null value
        System.out.println(opt2);//Optional.empty

        String name1 = "Hello";
        Optional<String> opt3 = Optional.ofNullable(name1);//return empty for null value
        System.out.println(opt3);
    }
}
