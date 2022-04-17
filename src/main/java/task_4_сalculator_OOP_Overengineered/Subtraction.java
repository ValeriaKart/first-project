package task_4_сalculator_OOP_Overengineered;

public class Subtraction extends Operation {
  public Subtraction(double number1, double number2) {
    super(number1, number2);
  }
  
  /**
   * @return разница первого и второго числа
   */
  @Override
  public double compute() {
    return number1 - number2;
  }
}
