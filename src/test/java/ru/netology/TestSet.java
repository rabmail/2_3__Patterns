package ru.netology;

import com.github.javafaker.Faker;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class TestSet {
    private static Faker faker = new Faker(new Locale("ru"));

    private  TestSet(){};

    public static String setDate(int date) {
        return LocalDate.now().plusDays(date).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

    public static String setFIO (){
        return faker.name().name();
    }

    public static String  setCity(){
       return faker.address().cityName();
       }

    public static String setPhone(){
         return faker.phoneNumber().phoneNumber();
    }

}