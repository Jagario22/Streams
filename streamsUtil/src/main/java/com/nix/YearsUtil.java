package com.nix;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class YearsUtil {
    public static List<Year> getAllLeapYears(Collection<Year> years) {
        Stream<Year> yearStream = years.stream();
        return yearStream.distinct().filter(Year::isLeap).sorted().collect(Collectors.toList());
    }

    public static Map<Month, Long> birthdays(Collection<LocalDate> birthdays) {
        return birthdays.stream()
                .collect(Collectors.groupingBy(LocalDate::getMonth, Collectors.counting()));
    }
}
