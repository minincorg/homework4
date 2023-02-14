package homework4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

class TriangleTest {
    Integer a = 5;
    Integer b = 6;
    Integer c = 7;

    double s = 14.6969385;
    boolean areaAboveZero = true;


    @Test
    void isASideEquals5() {
        Assertions.assertEquals(5, a.intValue(), "Значения не совпадают");
    }

    @Test
    void isBSideEquals6() {
        Assertions.assertEquals(6, b.intValue(), "Значения не совпадают");
    }

    @Test
    void isCSideEquals7() {
        Assertions.assertEquals(7, c.intValue(), "Значения не совпадают");
    }

    @Test
    void isAAboveZero() {
        Assumptions.assumeTrue(s > 0);
        Assertions.assertEquals(14.6969385, 14.6969385);
    }

    @Test
    void isSNotNull() {
        Assertions.assertNotNull(s);
    }

    @Test
    void squareException() {
        Assertions.assertThrows(NullPointerException.class, () -> getException(), "нет исключения");

        Assertions.assertThrows(IllegalArgumentException.class, () -> {Integer.parseInt("False");});
    }

    private String getException() throws NullPointerException {
        if (areaAboveZero) throw new NullPointerException();
        return "result";
    }

}