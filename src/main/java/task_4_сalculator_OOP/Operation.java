package task_4_сalculator_OOP;

public abstract class Operation {
  protected double number1;
  protected double number2;
  
  public Operation(double number1, double number2) {
    this.number1 = number1;
    this.number2 = number2;
  }
  
  public abstract double compute();
  
  public double getNumber1() {
    return number1;
  }
  
  public void setNumber1(double number1) {
    this.number1 = number1;
  }
  
  public double getNumber2() {
    return number2;
  }
  
  public void setNumber2(double number2) {
    this.number2 = number2;
  }
}
