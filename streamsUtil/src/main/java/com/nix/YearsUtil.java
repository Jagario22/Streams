package com.nix;
import java.time.Year;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class YearsUtil {
    public static List<Year> getAllLeapYears(Collection<Year> years) {
        Stream<Year> yearStream = years.stream();
        return yearStream.distinct().filter(Year::isLeap).sorted().collect(Collectors.toList());
    }

}
