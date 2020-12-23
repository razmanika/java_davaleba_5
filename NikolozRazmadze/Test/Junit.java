import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Junit {
    CalculatorServiceImpl calculatorServiceImpl = new CalculatorServiceImpl();


    @Test
    public void testCalculatorService() {


        assertEquals(0, calculatorServiceImpl.sum(2, 5));
        assertEquals(0, calculatorServiceImpl.prod(2, 5));

    }

}
