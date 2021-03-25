package ru.netology;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SetTest {

    public String setDate (int date){
        return LocalDate.now().plusDays(date).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }
}
