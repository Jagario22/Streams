package com.nix;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SequenceUtil {
    public static List<BigInteger> primeNumbers(int n) {
        Stream<BigInteger> primeNumbers = Stream.iterate(BigInteger.ONE, i -> i.add(BigInteger.ONE))
                .filter(num -> num.isProbablePrime((int)(1 - Math.pow(2,-100))));
        return primeNumbers.limit(n).collect(Collectors.toList());
    }
}
