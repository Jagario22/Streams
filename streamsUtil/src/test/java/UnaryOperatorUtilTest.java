import com.nix.UnaryOperatorUtil;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

import static org.junit.jupiter.api.Assertions.*;

public class UnaryOperatorUtilTest {

    @Test
    void reduce() {
        int n = 2;
        List<UnaryOperator<Integer>> unaryOperators = new ArrayList<>();
        unaryOperators.add(x -> x * x);
        unaryOperators.add(x -> x + x);
        unaryOperators.add(x -> x * 2);
        assertEquals(16, UnaryOperatorUtil.reduce(unaryOperators).apply(n));
    }
}
