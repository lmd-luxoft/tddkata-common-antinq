import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalcTest {

    public Calc calc;

    @BeforeEach
    public void preconditions(){
        calc = new Calc();
    }

    @Test
    public void zeroNumbersSumTest(){
        assertEquals(0, calc.sum(""));
    }


    @Test
    public void oneNumberSumTest(){
        assertEquals(5, calc.sum("5"));
    }

    @Test
    public void oneNumberAndComaSumTest(){
        assertEquals(8, calc.sum("8,"));
    }

    @Test
    public void twoNumbersSumTest(){
        assertEquals(12, calc.sum("6,5"));
    }

    @Test()
    public void incorrectNullInputSumTest(){
        assertEquals(-1, calc.sum(null));
    }

    @Test()
    public void incorrectFirstNumberSumTest(){
        assertEquals(-1, calc.sum("xx,8"));
    }

    @Test()
    public void incorrectSecondNumberSumTest(){
        assertEquals(-1, calc.sum("45,o"));
    }

    @Test()
    public void incorrectDelimiterSumTest(){
        assertEquals(-1, calc.sum("12:8"));
    }

}
