package calculator;

public class DivideByZeroException extends Exception {
  private static final String message = "На ноль делить нельзя!";
  
  public DivideByZeroException() {
    super(message);
  }
}
