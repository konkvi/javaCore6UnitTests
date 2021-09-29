import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    public void initTest() {
        System.out.println("Starting new test");
        calculator = new Calculator();
    }

    @AfterEach
    public void exitTest() {
        System.out.println("Test is completed");
    }

    @Test
    //проверяем обычное суммирование калькулятора (2+2=4)
    public void testPlus() { Assertions.assertEquals(4, calculator.plus.apply(2, 2));
    }

    @Test
    //проверяем вычитание с отрицательными числами (11-(-1) не равно 10)
    public void testMinus() {
        Assertions.assertNotEquals(10, calculator.minus.apply(11, -1));
    }

    @Test
    // проверяем деление на ноль и выдачу Integer.MAX_VALUE
    public void testDivide(){
        Assertions.assertTrue(calculator.divide.apply(1,0) > 0);
    }

}
