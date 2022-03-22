import java.util.Scanner;

public class Calculator {
  private final Scanner in;
  
  public Calculator(Scanner in) {
    this.in = in;
  }
  
  /**
   * метод реализует операции калькулятора: сложение (+), умножение (*), вичитание (-), деление (/)
   */
  public void start() {
    System.out.println("Выберите операцию. Введите знак \"+\" для сложения, знак \"*\" для умножения, " +
      "\"-\" - вычитания, \"/\" - деления ");
    // Сохраняем в переменную operation значение типа операции из консоли, возвращенное методом next()
    String operation = in.next();
    
    // Выводим пользователю просьбу ввести числа в консоль и сохраняем значения в переменные num1 и num2
    System.out.println("Введите первое число в виде десятичной дроби с разделителем запятой:");
    double num1 = in.nextDouble();
    System.out.println("Введите второе число в виде десятичной дроби с разделителем запятой:");
    double num2 = in.nextDouble();

        /*Условие для выбора операции с введенными числами. Если "+" - сложение,
        "*" - умножение, "-" - вычитание, "\" - деление. Иначе сообщение, что операция не поддерживается*/
    switch (operation) {
      case "+":
        System.out.printf("Результат = %.4f", add(num1, num2));
        break;
      case "*":
        System.out.printf("Результат = %.4f", multiply(num1, num2));
        break;
      case "-":
        System.out.printf("Результат = %.4f", subtract(num1, num2));
        break;
      case "/":
        System.out.printf("Результат = %.4f", divide(num1, num2));
        break;
      default:
        System.out.println("Введенная операция не поддерживается. Попробуйте снова, используя знаки +, *, -, /.");
        break;
    }
    in.close();
  }
  
  /**
   * @param number1 - первое число в виде десятичной дроби с разделителем запятой
   * @param number2 - второе число в виде десятичной дроби с разделителем запятой
   * @return метод возвращает результат сложения двух чисел (number1 и number2)
   */
  private double add(double number1, double number2) {
    return number1 + number2;
  }
  
  /**
   * @param number1 - первое число в виде десятичной дроби с разделителем запятой
   * @param number2 - второе число в виде десятичной дроби с разделителем запятой
   * @return метод возвращает результат умножения двух чисел (number1 и number2)
   */
  private double multiply(double number1, double number2) {
    return number1 * number2;
  }
  
  /**
   * @param number1 - первое число в виде десятичной дроби с разделителем запятой
   * @param number2 - второе число в виде десятичной дроби с разделителем запятой
   * @return метод возвращает результат вычитания двух чисел (number1 и number2)
   */
  private double subtract(double number1, double number2) {
    return number1 - number2;
  }
  
  /**
   * @param number1 - первое число в виде десятичной дроби с разделителем запятой
   * @param number2 - второе число в виде десятичной дроби с разделителем запятой
   * @return метод возвращает результат деления двух чисел (number1 и number2), если второе не равно 0
   */
  private double divide(double number1, double number2) {
    // TODO: add exception on zero division
    return number1 / number2;
  }
}

