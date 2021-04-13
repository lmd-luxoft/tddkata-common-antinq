import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalcTest {

    public Calc calc;
    public int expectedSumResult;
    public String inputExpression;

    @BeforeEach
    public void preconditions(){
        calc = new Calc();
    }

    @Test
    public void zeroNumbersSumTest(){
        expectedSumResult = 0;
        inputExpression = "";
        assertEquals(expectedSumResult, calc.sum(inputExpression));
    }

    @Test
    public void oneNumberSumTest(){
        expectedSumResult = 5;
        inputExpression = "5";
        assertEquals(expectedSumResult, calc.sum(inputExpression));
    }

    @Test
    public void oneNumberAndComaSumTest(){
        expectedSumResult = 8;
        inputExpression = "8";
        assertEquals(expectedSumResult, calc.sum(inputExpression));
    }

    @Test
    public void twoNumbersSumTest(){
        expectedSumResult = 11;
        inputExpression = "6,5";
        assertEquals(expectedSumResult, calc.sum(inputExpression));
    }

    @Test()
    public void incorrectNullInputSumTest(){
        expectedSumResult = -1;
        inputExpression = null;
        assertEquals(expectedSumResult, calc.sum(inputExpression));
    }

    @Test()
    public void incorrectFirstNumberSumTest(){
        expectedSumResult = -1;
        inputExpression = "xx,8";
        assertEquals(expectedSumResult, calc.sum(inputExpression));
    }

    @Test()
    public void incorrectSecondNumberSumTest(){
        expectedSumResult = -1;
        inputExpression = "45,o";
        assertEquals(expectedSumResult, calc.sum(inputExpression));

    }

    @Test()
    public void incorrectDelimiterSumTest(){
        expectedSumResult = -1;
        inputExpression = "12:8";
        assertEquals(expectedSumResult, calc.sum(inputExpression));
    }

}
