import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReversePolishNotationCalculatorTest {

    private static ReversePolishNotationCalculator reversePolishNotationCalculator =
        new ReversePolishNotationCalculator();


    @Test
    public void shouldCalculateAddition() {
        Assertions.assertEquals(5,
            reversePolishNotationCalculator.calculatePolishNotation("2 3 +"));
    }

    @Test
    public void shouldCalculateMultiply() {
        Assertions.assertEquals(6,
            reversePolishNotationCalculator.calculatePolishNotation("2 3 *"));
    }

    @Test
    public void shouldCalculateSubtraction() {
        Assertions.assertEquals(1,
            reversePolishNotationCalculator.calculatePolishNotation("3 2 -"));
    }

    @Test
    public void ComplexTest() {
        Assertions.assertEquals(12,
            reversePolishNotationCalculator.calculatePolishNotation("2 3 3 + *"));
    }

    @Test
    public void isOperationTesting(){
        Assertions.assertTrue(reversePolishNotationCalculator.isOperation("+"));
        Assertions.assertTrue(reversePolishNotationCalculator.isOperation("-"));
        Assertions.assertTrue(reversePolishNotationCalculator.isOperation("*"));
        Assertions.assertFalse(reversePolishNotationCalculator.isOperation("/"));
        Assertions.assertFalse(reversePolishNotationCalculator.isOperation("3"));
    }


}