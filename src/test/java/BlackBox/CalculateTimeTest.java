package BlackBox;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateTimeBlackBoxTest {

    // (Strong) Boundary Value Testing

    @Test
    void calculateEndTimeOf_0_30_30_AM() {
        CalculateTime calculate = new CalculateTime();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    calculate.calculate_time(new Time(0,30,30,"AM"));
                });
    }

    @Test
    void calculateEndTimeOf_1_30_30_AM() {
        CalculateTime calculate = new CalculateTime();
        assertEquals(new Time(3,0,30,"AM"),calculate.calculate_time(new Time(1,30,30,"AM")));
    }

    @Test
    void calculateEndTimeOf_2_30_30_AM() {
        CalculateTime calculate = new CalculateTime();
        assertEquals(new Time(4,0,30,"AM"),calculate.calculate_time(new Time(2,30,30,"AM")));
    }

    @Test
    void calculateEndTimeOf_11_30_30_AM() {
        CalculateTime calculate = new CalculateTime();
        assertEquals(new Time(1,0,30,"PM"),calculate.calculate_time(new Time(11,30,30,"AM")));
    }

    @Test
    void calculateEndTimeOf_12_30_30_AM() {
        CalculateTime calculate = new CalculateTime();
        assertEquals(new Time(2,0,30,"AM"),calculate.calculate_time(new Time(12,30,30,"AM")));
    }

    @Test
    void calculateEndTimeOf_13_30_30_AM() {
        CalculateTime calculate = new CalculateTime();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    calculate.calculate_time(new Time(13,30,30,"AM"));
                });
    }

    @Test
    void calculateEndTimeOf_6_n1_30_AM() {
        CalculateTime calculate = new CalculateTime();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    calculate.calculate_time(new Time(6,-1,30,"AM"));
                });
    }

    @Test
    void calculateEndTimeOf_6_0_30_AM() {
        CalculateTime calculate = new CalculateTime();
        assertEquals(new Time(7,30,30,"AM"),calculate.calculate_time(new Time(6,0,30,"AM")));
    }

    @Test
    void calculateEndTimeOf_6_1_30_AM() {
        CalculateTime calculate = new CalculateTime();
        assertEquals(new Time(7,31,30,"AM"),calculate.calculate_time(new Time(6,1,30,"AM")));
    }

    @Test
    void calculateEndTimeOf_6_58_30_AM() {
        CalculateTime calculate = new CalculateTime();
        assertEquals(new Time(8,28,30,"AM"),calculate.calculate_time(new Time(6,58,30,"AM")));
    }

    @Test
    void calculateEndTimeOf_6_59_30_AM() {
        CalculateTime calculate = new CalculateTime();
        assertEquals(new Time(8,29,30,"AM"),calculate.calculate_time(new Time(6,59,30,"AM")));
    }

    @Test
    void calculateEndTimeOf_6_60_30_AM() {
        CalculateTime calculate = new CalculateTime();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    calculate.calculate_time(new Time(6,60,30,"AM"));
                });
    }

    @Test
    void calculateEndTimeOf_6_30_n1_AM() {
        CalculateTime calculate = new CalculateTime();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    calculate.calculate_time(new Time(6,30,-1,"AM"));
                });
    }

    @Test
    void calculateEndTimeOf_6_30_0_AM() {
        CalculateTime calculate = new CalculateTime();
        assertEquals(new Time(8,0,0,"AM"),calculate.calculate_time(new Time(6,30,0,"AM")));
    }

    @Test
    void calculateEndTimeOf_6_30_1_AM() {
        CalculateTime calculate = new CalculateTime();
        assertEquals(new Time(8,0,1,"AM"),calculate.calculate_time(new Time(6,30,1,"AM")));
    }

    @Test
    void calculateEndTimeOf_6_30_58_AM() {
        CalculateTime calculate = new CalculateTime();
        assertEquals(new Time(8,0,58,"AM"),calculate.calculate_time(new Time(6,30,58,"AM")));
    }

    @Test
    void calculateEndTimeOf_6_30_59_AM() {
        CalculateTime calculate = new CalculateTime();
        assertEquals(new Time(8,0,59,"AM"),calculate.calculate_time(new Time(6,30,59,"AM")));
    }

    @Test
    void calculateEndTimeOf_6_30_60_AM() {
        CalculateTime calculate = new CalculateTime();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    calculate.calculate_time(new Time(6,30,60,"AM"));
                });
    }


    @Test
    void calculateEndTimeOf_0_30_30_PM() {
        CalculateTime calculate = new CalculateTime();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    calculate.calculate_time(new Time(0,30,30,"PM"));
                });
    }

    @Test
    void calculateEndTimeOf_1_30_30_PM() {
        CalculateTime calculate = new CalculateTime();
        assertEquals(new Time(3,0,30,"PM"),calculate.calculate_time(new Time(1,30,30,"PM")));
    }

    @Test
    void calculateEndTimeOf_2_30_30_PM() {
        CalculateTime calculate = new CalculateTime();
        assertEquals(new Time(4,0,30,"PM"),calculate.calculate_time(new Time(2,30,30,"PM")));
    }

    @Test
    void calculateEndTimeOf_11_30_30_PM() {
        CalculateTime calculate = new CalculateTime();
        assertEquals(new Time(1,0,30,"AM"),calculate.calculate_time(new Time(11,30,30,"PM")));
    }

    @Test
    void calculateEndTimeOf_12_30_30_PM() {
        CalculateTime calculate = new CalculateTime();
        assertEquals(new Time(2,0,30,"PM"),calculate.calculate_time(new Time(12,30,30,"PM")));
    }

    @Test
    void calculateEndTimeOf_13_30_30_PM() {
        CalculateTime calculate = new CalculateTime();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    calculate.calculate_time(new Time(13,30,30,"PM"));
                });
    }

    @Test
    void calculateEndTimeOf_6_n1_30_PM() {
        CalculateTime calculate = new CalculateTime();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    calculate.calculate_time(new Time(6,-1,30,"PM"));
                });
    }

    @Test
    void calculateEndTimeOf_6_0_30_PM() {
        CalculateTime calculate = new CalculateTime();
        assertEquals(new Time(7,30,30,"PM"),calculate.calculate_time(new Time(6,0,30,"PM")));
    }

    @Test
    void calculateEndTimeOf_6_1_30_PM() {
        CalculateTime calculate = new CalculateTime();
        assertEquals(new Time(7,31,30,"PM"),calculate.calculate_time(new Time(6,1,30,"PM")));
    }

    @Test
    void calculateEndTimeOf_6_58_30_PM() {
        CalculateTime calculate = new CalculateTime();
        assertEquals(new Time(8,28,30,"PM"),calculate.calculate_time(new Time(6,58,30,"PM")));
    }

    @Test
    void calculateEndTimeOf_6_59_30_PM() {
        CalculateTime calculate = new CalculateTime();
        assertEquals(new Time(8,29,30,"PM"),calculate.calculate_time(new Time(6,59,30,"PM")));
    }

    @Test
    void calculateEndTimeOf_6_60_30_PM() {
        CalculateTime calculate = new CalculateTime();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    calculate.calculate_time(new Time(6,60,30,"PM"));
                });
    }

    @Test
    void calculateEndTimeOf_6_30_n1_PM() {
        CalculateTime calculate = new CalculateTime();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    calculate.calculate_time(new Time(6,30,-1,"PM"));
                });
    }

    @Test
    void calculateEndTimeOf_6_30_0_PM() {
        CalculateTime calculate = new CalculateTime();
        assertEquals(new Time(8,0,0,"PM"),calculate.calculate_time(new Time(6,30,0,"PM")));
    }

    @Test
    void calculateEndTimeOf_6_30_1_PM() {
        CalculateTime calculate = new CalculateTime();
        assertEquals(new Time(8,0,1,"PM"),calculate.calculate_time(new Time(6,30,1,"PM")));
    }

    @Test
    void calculateEndTimeOf_6_30_58_PM() {
        CalculateTime calculate = new CalculateTime();
        assertEquals(new Time(8,0,58,"PM"),calculate.calculate_time(new Time(6,30,58,"PM")));
    }

    @Test
    void calculateEndTimeOf_6_30_59_PM() {
        CalculateTime calculate = new CalculateTime();
        assertEquals(new Time(8,0,59,"PM"),calculate.calculate_time(new Time(6,30,59,"PM")));
    }

    @Test
    void calculateEndTimeOf_6_30_60_PM() {
        CalculateTime calculate = new CalculateTime();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    calculate.calculate_time(new Time(6,30,60,"PM"));
                });
    }

    // Weak Equivalence Testing

    @Test
    void calculateEndTimeOf_2_15_46_AM() {
        CalculateTime calculate = new CalculateTime();
        assertEquals(new Time(3,45,46,"AM"),calculate.calculate_time(new Time(2,15,46,"AM")));
    }
    @Test
    void calculateEndTimeOf_10_47_55_PM() {
        CalculateTime calculate = new CalculateTime();
        assertEquals(new Time(12,17,55,"AM"),calculate.calculate_time(new Time(10,47,55,"PM")));
    }
    @Test
    void calculateEndTimeOf_11_33_15_PM() {
        CalculateTime calculate = new CalculateTime();
        assertEquals(new Time(1,3,15,"AM"),calculate.calculate_time(new Time(11,33,15,"PM")));
    }
    @Test
    void calculateEndTimeOf_12_10_15_PM() {
        CalculateTime calculate = new CalculateTime();
        assertEquals(new Time(1,40,15,"PM"),calculate.calculate_time(new Time(12,10,15,"PM")));
    }

    @Test
    void calculateEndTimeOf_13_66_n1_XM() {
        CalculateTime calculate = new CalculateTime();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    calculate.calculate_time(new Time(13,66,-1,"XM"));
                });
    }
}

class CalculateTimeCFGTest {
    @Test
    void calculateEndTimeOf_19_04_13_AM() {
        CalculateTime calculate = new CalculateTime();
        assertThrows(IllegalArgumentException.class,
                () -> {
                    calculate.calculate_time(new Time(19,04,13,"AM"));
                });
    }

    @Test
    void calculateEndTimeOf_12_24_21_PM() {
        CalculateTime calculate = new CalculateTime();
        assertEquals(new Time(1,54,21,"PM"),calculate.calculate_time(new Time(12,24,21,"PM")));
    }

    @Test
    void calculateEndTimeOf_8_46_35_PM() {
        CalculateTime calculate = new CalculateTime();
        assertEquals(new Time(10,16,35,"PM"),calculate.calculate_time(new Time(8,46,35,"PM")));
    }

    @Test
    void calculateEndTimeOf_10_14_26_AM() {
        CalculateTime calculate = new CalculateTime();
        assertEquals(new Time(11,44,26,"AM"),calculate.calculate_time(new Time(10,14,26,"AM")));
    }

    @Test
    void calculateEndTimeOf_10_49_33_AM() {
        CalculateTime calculate = new CalculateTime();
        assertEquals(new Time(12,19,33,"PM"),calculate.calculate_time(new Time(10,49,33,"AM")));
    }

    @Test
    void calculateEndTimeOf_10_59_46_PM() {
        CalculateTime calculate = new CalculateTime();
        assertEquals(new Time(12,29,46,"AM"),calculate.calculate_time(new Time(10,59,46,"PM")));
    }

    @Test
    void calculateEndTimeOf_11_13_21_AM() {
        CalculateTime calculate = new CalculateTime();
        assertEquals(new Time(12,43,21,"PM"),calculate.calculate_time(new Time(11,13,21,"AM")));
    }

    @Test
    void calculateEndTimeOf_11_43_59_PM() {
        CalculateTime calculate = new CalculateTime();
        assertEquals(new Time(1,13,59,"AM"),calculate.calculate_time(new Time(11,43,59,"PM")));
    }
}