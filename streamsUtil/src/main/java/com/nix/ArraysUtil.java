package com.nix;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArraysUtil {

    public static Double max(double[] arr) {
        Double[] target = Arrays.stream(arr).boxed().toArray(Double[]::new);
        Stream<Double> arrStream = Stream.of(target);
        return arrStream.max(Double::compareTo).get();
    }

    public static Double min(double[] arr) {
        Double[] target = Arrays.stream(arr).boxed().toArray(Double[]::new);
        Stream<Double> arrStream = Stream.of(target);
        return arrStream.min(Double::compareTo).get();
    }

    public static OptionalDouble average(double[] arr) {
        Double[] target = Arrays.stream(arr).boxed().toArray(Double[]::new);
        Stream<Double> arrStream = Stream.of(target);
        return arrStream.mapToDouble(Double::doubleValue).average();
    }

    public static Double sum(double[] arr) {
        Double[] target = Arrays.stream(arr).boxed().toArray(Double[]::new);
        Stream<Double> arrStream = Stream.of(target);
        return arrStream.mapToDouble(Double::doubleValue).sum();
    }

    public static double[] generateDoubleArr(int length) {
        return DoubleStream.generate(() -> new Random().nextInt(length)).limit(length).toArray();
    }

    public static int[] generateIntArr(int length) {
        return IntStream.generate(() -> new Random().nextInt(length)).limit(length).toArray();
    }

    public static int[] arraySplitting(int[] array) {
        Integer[] target = Arrays.stream(array).boxed().toArray(Integer[]::new);
        List<Integer> result = Stream.of(target).filter(n-> n% 2 == 0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        List<Integer> odd = Stream.of(target).filter(n-> n % 2 != 0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        result.addAll(odd);
        return result.stream().mapToInt(i->i).toArray();
    }
}
