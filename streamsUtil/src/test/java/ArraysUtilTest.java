import com.nix.ArraysUtil;
import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;

import static org.junit.jupiter.api.Assertions.*;

public class ArraysUtilTest {

    @Test
    void max() {
        double[] arr = {1.1, 2.4, 2.8, 0, 3, 2.7, 6, 10, 4};
        assertEquals(10, ArraysUtil.max(arr));
    }

    @Test
    void min() {
        double[] arr = {1.1, 2.4, 2.8, 0, 3, 2.7, 6, 10, 4};
        assertEquals(0, ArraysUtil.min(arr));
    }

    @Test
    void average() {
        double[] arr = {1.1, 2.4, 2.8, 0, 3, 2.7, 6, 10, 4};
        double testResult = 32./9;
        assertEquals(OptionalDouble.of(testResult), ArraysUtil.average(arr));
    }

    @Test
    void sum() {
        double[] arr = {1.1, 2.4, 2.8, 0, 3, 2.7, 6, 10, 4};
        assertEquals(32, ArraysUtil.sum(arr));
    }
}
