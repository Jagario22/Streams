import com.nix.ArraysUtil;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

import static org.junit.jupiter.api.Assertions.*;

public class ArraysUtilTest {
    public static double[] arr = {1.1, 2.4, 2.8, 0, 3, 2.7, 6, 10, 4};

    @Test
    void max() {
        assertEquals(10, ArraysUtil.max(arr));
    }

    @Test
    void min() {
        assertEquals(0, ArraysUtil.min(arr));
    }

    @Test
    void average() {
        double testResult = 32. / 9;
        assertEquals(OptionalDouble.of(testResult), ArraysUtil.average(arr));
    }

    @Test
    void sum() {
        assertEquals(32, ArraysUtil.sum(arr));
    }

    @Test
    void arraySplitting() {
        int[] nums = {0, 1, 3, 6, 5, 7, 4, 9, 8};
        List<Integer> even = Arrays.asList(8, 6, 4, 0);
        List<Integer> odd = Arrays.asList(9, 7, 5, 3, 1);
        List<List<Integer>> exceptedResults = new ArrayList<>();
        exceptedResults.add(even);
        exceptedResults.add(odd);
        assertEquals(exceptedResults, ArraysUtil.arraySplitting(nums));
    }
}
