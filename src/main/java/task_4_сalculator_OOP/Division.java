package task_4_сalculator_OOP;

public class Division extends Operation {
  public Division(double number1, double number2) {
    super(number1, number2);
  }
  
  /**
   * @return результат деления первого числа на второе
   */
  @Override
  public double compute() {
    return number1 / number2;
    //TODO add an exception on zero division
  }
}
