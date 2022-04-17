package task_4_сalculator_OOP_Overengineered;

public class Multiplication extends Operation {
  public Multiplication(double number1, double number2) {
    super(number1, number2);
  }
  
  /**
   * @return произведение первого и второго числа
   */
  @Override
  public double compute() {
    return number1 * number2;
  }
}
