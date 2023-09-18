import com.codebase.Calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
  Calculator calculator = new Calculator();
  @Test
  public void canAdd(){
    assertEquals(2, calculator.add(1,1));
  }
  @Test
  public void canSubtract(){
    assertEquals(8, calculator.subtract(10,2));
  }
  @Test
  public void canMultiply(){
    assertEquals(4, calculator.multiply(2,2));
  }
  @Test
  public void canDivide(){
    assertEquals(2, calculator.divide(10,5), 0);
  }
}