package Calculator;

public class Calculator {
  public double addNumbers (double num1, double num2){
    return num1 + num2;
  }
  public double subtractNumbers (double num1, double num2){
    return num1 - num2;
  }
  public double multiplyNumbers (double num1, double num2){
    return num1 * num2;
  }
  public double divideNumbers (double num1, double num2) throws DivideByZeroException {
    if (num2 == 0){
      throw new DivideByZeroException("На ноль делить нельзя!");
    }
    return num1 / num2;
  }
}
