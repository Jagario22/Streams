package com.nix;

import java.time.Year;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.OptionalDouble;

public class StreamApp {
    public static double[] arr = ArraysUtil.generateArr(10);

    public static void main(String[] args) {

        System.out.println("1: массив: " + Arrays.toString(arr));
        double max = ArraysUtil.max(arr);
        double min = ArraysUtil.min(arr);
        double average = ArraysUtil.average(arr).getAsDouble();
        double sum = ArraysUtil.sum(arr);
        System.out.println("Максимум: " + max + ", среднее значение: " + average +
                ", минимум: " + min + ", сумма: " + sum + "\n");

        Collection<Year> years = Arrays.asList(Year.of(2000), Year.of(2008), Year.of(2003), Year.of(2016), Year.of(2004),
                Year.of(2009), Year.of(2010), Year.of(2012), Year.of(2001));
        String resultYears = YearsUtil.getAllLeapYears(years).toString();
        System.out.println("2. Года: " + years.toString());
        System.out.println("Високосные года: " + resultYears + "\n");


        List<String> strings = Arrays.asList("1abb3a", "2ab3c5", "4ab4c");
        List<String> resultStrings = StringUtil.cut("[\\d]", strings);
        System.out.println("3. Строки: " + strings.toString());
        System.out.println("Результат (строки состоящие из букв): " + resultStrings + "\n");


        List<String> palindromes = Arrays.asList("шабаш шалаш  привет    звезда ", "   тет-а-тет    ага    земля   ", "медведь");
        List<String> result = StringUtil.palindromes(palindromes);
        System.out.println("4. Строки " + palindromes.toString());
        System.out.println("Палиндромы " + result.toString());
    }
}
