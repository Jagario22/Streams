package com.nix;

import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;
import java.util.Arrays;

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

    public static double[] generateArr(int length) {
        return DoubleStream.generate(() -> new Random().nextInt(length)).limit(length).toArray();
    }
}
