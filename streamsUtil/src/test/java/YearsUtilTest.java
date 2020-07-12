import com.nix.YearsUtil;
import org.junit.jupiter.api.Test;

import java.time.Year;
import java.util.Arrays;
import java.util.Collection;


import static org.junit.jupiter.api.Assertions.*;

public class YearsUtilTest {

    @Test
    void getAllLeapYears() {
        Collection<Year> years = Arrays.asList(Year.of(2000), Year.of(2008), Year.of(2003), Year.of(2016), Year.of(2004),
                Year.of(2009), Year.of(2010), Year.of(2012), Year.of(2001));

        assertEquals(Arrays.asList(Year.of(2000), Year.of(2004), Year.of(2008), Year.of(2012), Year.of(2016)), YearsUtil.getAllLeapYears(years));

    }
}
