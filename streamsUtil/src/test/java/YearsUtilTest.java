import com.nix.YearsUtil;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.*;


import static org.junit.jupiter.api.Assertions.*;

public class YearsUtilTest {

    @Test
    void getAllLeapYears() {
        Collection<Year> years = Arrays.asList(Year.of(2000), Year.of(2008), Year.of(2003), Year.of(2016), Year.of(2004),
                Year.of(2009), Year.of(2010), Year.of(2012), Year.of(2001));

        assertEquals(Arrays.asList(Year.of(2000), Year.of(2004), Year.of(2008), Year.of(2012), Year.of(2016)), YearsUtil.getAllLeapYears(years));

    }

    @Test
    void birthdays() {
        List<LocalDate> localDates = Arrays.asList(LocalDate.of(2000, 12, 22),
                LocalDate.of(2000, 12, 23), LocalDate.of(2000, 11, 23));
        Map<Month, Long> expectedResults = new HashMap<>();
        expectedResults.put(Month.DECEMBER, 2L);
        expectedResults.put(Month.NOVEMBER, 1L);
        assertEquals(expectedResults, YearsUtil.birthdays(localDates));
    }
}
