import com.nix.SequenceUtil;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SequenceUtilTest {

    @Test
    void primeNumbers() {
        List<BigInteger> expectedResults = Arrays.asList(BigInteger.valueOf(2),
                BigInteger.valueOf(3), BigInteger.valueOf(5), BigInteger.valueOf(7),
                BigInteger.valueOf(11), BigInteger.valueOf(13), BigInteger.valueOf(17),
                BigInteger.valueOf(19), BigInteger.valueOf(23), BigInteger.valueOf(29));

        assertEquals(expectedResults, SequenceUtil.primeNumbers(10));

    }
}
