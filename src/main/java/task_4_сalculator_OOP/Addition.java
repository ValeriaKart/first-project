package task_4_сalculator_OOP;

public class Addition extends Operation {
  public Addition(double number1, double number2) {
    super(number1, number2);
  }
  
  /**
   * @return сумма первого и второго числа
   */
  @Override
  public double compute() {
    return number1 + number2;
  }
}
