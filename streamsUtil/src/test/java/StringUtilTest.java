import com.nix.StringUtil;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilTest {

    @Test
    void cut() {
        List<String> str = Arrays.asList("1abb3a", "2ab3c5", "4ab4c");
        List<String> testResult = Arrays.asList("abba", "abc", "abc");
        assertEquals(testResult, StringUtil.cut("[\\d]", str));
    }

    @Test
    void palindromes() {
        List<String> str = StringUtil.palindromes(Arrays.asList("шабаш шалаш  привет    звезда ", "   тет-а-тет    ага    земля   ", "ac"));
        System.out.println("str = " + str.toString());
    }
}
