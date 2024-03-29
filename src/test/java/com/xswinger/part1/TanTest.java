package com.xswinger.part1;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TanTest {

    private TaylorSeries series = new TaylorSeries();
    
    @ParameterizedTest
    @CsvSource({"0, 0", "1, 1.557", "-1, -1.557", "4, 1.157", "-4, -1.157", "5, -3.380", "-5, 3.380", "4.712, 2570.823"})
    public void testZeroValue(double seriesValue, double funcValue) {
        assertEquals(funcValue, series.calc(seriesValue, 10), 0.02);
    }
}
