package com.nix;

import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorUtil {
    public static UnaryOperator<Integer> reduce(List<UnaryOperator<Integer>> unaryOperators) {
        return unaryOperators.stream()
                        .reduce(s -> s, (a, b) -> s -> b.apply(a.apply(s)));
    }
}
