package calculator;

public class IllegalOperatorException extends Exception{
  private static final String message = "Введенная операция не поддерживается. Попробуйте снова, используя знаки +, *, -, /.";
  
  public IllegalOperatorException() {
    super(message);
  }
}
