package com.nix;

import java.math.BigInteger;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.*;
import java.util.function.UnaryOperator;

public class StreamApp {
    public static double[] arr = ArraysUtil.generateDoubleArr(10);
    public static int[] arr2 = ArraysUtil.generateIntArr(10);

    public static void main(String[] args) {

        double max = ArraysUtil.max(arr);
        double min = ArraysUtil.min(arr);
        double average = ArraysUtil.average(arr).getAsDouble();
        double sum = ArraysUtil.sum(arr);
        System.out.println("1: массив: " + Arrays.toString(arr));
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
        System.out.println("Строки удовлетворяющие регулярному выражению (строки состоящие из букв): "
                + resultStrings + "\n");


        List<String> palindromes = Arrays.asList("шабаш шалаш  привет    звезда ", "   тет-а-тет    ага    земля   ", "медведь");
        List<String> result = StringUtil.palindromes(palindromes);
        System.out.println("4. Строки " + palindromes.toString());
        System.out.println("Палиндромы " + result.toString() + "\n");

        int n = 10;
        List<BigInteger> primeNums = SequenceUtil.primeNumbers(n);
        System.out.println("5. n = " + n);
        System.out.println("Простые числа = " + primeNums.toString() + "\n");

        List<LocalDate> localDates = Arrays.asList(LocalDate.of(2000, 12, 22),
                LocalDate.of(2000,12,23), LocalDate.of(2000,11,23));
        Map<Month, Long> resultBirthdays = YearsUtil.birthdays(localDates);
        System.out.println("6. Даты: " + localDates.toString());
        System.out.println("Дни рождения: " + resultBirthdays.toString() + "\n");

        List<List<Integer>> resultLists = ArraysUtil.arraySplitting(arr2);
        System.out.println("7. Данные: " + Arrays.toString(arr2));
        System.out.println("Массив после разделения: " + resultLists.toString() + "\n");

        List<UnaryOperator<Integer>> unaryOperators = new ArrayList<>();
        unaryOperators.add(x -> x * x);
        unaryOperators.add(x -> x + x);
        unaryOperators.add(x -> x * 2);
        int num = 2;
        Integer resultOperations = UnaryOperatorUtil.reduce(unaryOperators).apply(num);
        System.out.println("8. Число " + num);
        System.out.println("l1 = x * x; l2 = x + x; l3 = x * 2");
        System.out.println("Результат объединения " + resultOperations);



    }
}
