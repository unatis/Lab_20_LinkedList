package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> cars = new LinkedList<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println(cars);

        cars.addFirst("Mitsubishi");

        for(String Car : cars){
            System.out.println(Car);
        }


    }

}
