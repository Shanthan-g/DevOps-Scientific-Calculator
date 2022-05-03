import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import Calculator.Calculator;

public class CalculatorTest {
    Calculator calculator ;

    private static final double DELTA = 1e-15;
    @Before
    public void beforeTest(){
        this.calculator = new Calculator();
    }


    @Test
    public void testSquareRoot() {
        assertEquals("Checking true positive case for square root:", 10, calculator.squareRoot(100), DELTA);
        assertNotEquals("Checking false positive case for square root:", 5, calculator.squareRoot(100), DELTA);
    }


    @Test
    public void squareRootException() throws IllegalArgumentException{
        calculator.squareRoot(-10);
    }


    @Test
    public void testFactorial() {
        assertEquals("Checking the true positive case for factorial:", 120, calculator.factorial(5), DELTA);
        assertNotEquals("Checking false positive case for factorial:", 24, calculator.factorial(5), DELTA);
    }


    @Test
    public void factorialTestException() throws IllegalArgumentException{
        calculator.factorial(-10);
    }


    @Test
    public void testLogarithm() {
        assertEquals("Checking true positive case for logarithm:", 4.605170185988092, calculator.naturalLog(100), DELTA);
        assertNotEquals("Checking false positive case for logarithm:", 100, calculator.naturalLog(100), DELTA);
    }

    @Test
    public void logTestException() throws IllegalArgumentException{
        calculator.naturalLog(-100);
    }

    @Test
    public void testPower() {
        assertEquals("Checking true positive case for power:", 100, calculator.power(10, 2), DELTA);
        assertNotEquals("Checking false positive case for power:", 10, calculator.power(10, 2), DELTA);
    }

    @Test
    public void powerTestException() throws IllegalArgumentException{
        calculator.power(-10, 2);
    }
}