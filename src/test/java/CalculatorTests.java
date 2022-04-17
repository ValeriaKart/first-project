import calculator.Calculator;
import calculator.DivideByZeroException;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTests {
  @Test
  public void addNumbers() {
    Calculator calculator = new Calculator();
    Assert.assertEquals(6.69134, calculator.addNumbers(2.12345, 4.56789), 0);
  }
  
  @Test
  public void addNumbersToZero() {
    Calculator calculator = new Calculator();
    Assert.assertEquals(4.56789, calculator.addNumbers(0, 4.56789), 0);
  }
  
  @Test
  public void addNumbersNegativeNumberInResult() {
    Calculator calculator = new Calculator();
    Assert.assertEquals(-966.5, calculator.addNumbers(33.5, -1000), 0);
  }
  
  @Test
  public void subtractNumbersPositiveNumberInResult() {
    Calculator calculator = new Calculator();
    Assert.assertEquals(3311.2218, calculator.subtractNumbers(3333.444, 22.2222), 0);
  }
  
  @Test
  public void subtractNumbersNegativeNumberInResult() {
    Calculator calculator = new Calculator();
    Assert.assertEquals(-27.99, calculator.subtractNumbers(22.01, 50), 0);
  }
  
  @Test
  public void subtractNumbersZeroInResult() {
    Calculator calculator = new Calculator();
    Assert.assertEquals(0, calculator.subtractNumbers(44.567, 44.567), 0);
  }
  
  @Test
  public void multiplyNumbersZeroInResult() {
    Calculator calculator = new Calculator();
    Assert.assertEquals(0, calculator.multiplyNumbers(44.567, 0), 0);
  }
  
  @Test
  public void multiplyNumbersNegativeNumberInResult() {
    Calculator calculator = new Calculator();
    Assert.assertEquals(-378.8195, calculator.multiplyNumbers(44.567, -8.5), 0);
  }
  
  @Test
  public void multiplyNumbersPositiveNumberInResult() {
    Calculator calculator = new Calculator();
    Assert.assertEquals(9.68, calculator.multiplyNumbers(0.11, 88), 0);
  }
  
  @Test
  public void divideNumbersPositiveNumberInResult() throws DivideByZeroException {
    Calculator calculator = new Calculator();
    Assert.assertEquals(1100.0385, calculator.divideNumbers(22000.77, 20), 0);
  }
  
  @Test
  public void divideNumbersNegativeNumberInResult() throws DivideByZeroException {
    Calculator calculator = new Calculator();
    Assert.assertEquals(-1100.0385, calculator.divideNumbers(-22000.77, 20), 0);
  }
  
  @Test
  public void divideNumbersFirstNumberIsSmallerThanSecond() throws DivideByZeroException {
    Calculator calculator = new Calculator();
    Assert.assertEquals(0.275, calculator.divideNumbers(5.5, 20), 0);
  }
  
  @Test(expected = DivideByZeroException.class)
  public void itShouldThrowDivideByZeroExceptionWhenSecondNumberIsZero() throws DivideByZeroException {
    Calculator calculator = new Calculator();
    calculator.divideNumbers(20, 0);
  }
}
