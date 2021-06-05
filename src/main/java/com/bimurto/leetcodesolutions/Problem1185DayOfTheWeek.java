package com.bimurto.leetcodesolutions;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Problem1185DayOfTheWeek {
    public String dayOfTheWeek(int day, int month, int year) {
        LocalDate localDate = LocalDate.of(year,month,day);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        String []dayMap = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        return dayMap[dayOfWeek.getValue()-1];
    }
}
