package calculator;

import java.util.Scanner;

public class Base {
  public static void main(String[] args) {
    double num1;
    double num2;
    
    Scanner in = new Scanner(System.in);
    
    System.out.println("Выберите операцию. Введите знак \"+\" для сложения, знак \"*\" для умножения, " +
      "\"-\" - вычитания, \"/\" - деления ");
    // Сохраняем в переменную operation значение типа операции из консоли, возвращенное методом next()
    String operation = in.nextLine();
    
    // Выводим пользователю просьбу ввести числа в консоль и сохраняем значения в переменные num1 и num2
    try {
      System.out.println("Введите первое число в виде десятичной дроби с разделителем запятой:");
      String num1Str = in.nextLine();
      num1 = Double.parseDouble(num1Str);
      System.out.println("Введите второе число в виде десятичной дроби с разделителем запятой:");
      String num2Str = in.nextLine();
      num2 = Double.parseDouble(num2Str);
    } catch (NumberFormatException e) {
      System.out.println("Введенный формат не поддерживается. Введите, пожалуйста, число.");
      return;
    }
    
    Calculator calculator = new Calculator();
    
    /*Условие для выбора операции с введенными числами. Если "+" - сложение,
        "*" - умножение, "-" - вычитание, "\" - деление. Иначе сообщение, что операция не поддерживается*/
    double result;
    
    try {
      switch (operation) {
        case "+":
          result = calculator.addNumbers(num1, num2);
          break;
        case "*":
          result = calculator.multiplyNumbers(num1, num2);
          break;
        case "-":
          result = calculator.subtractNumbers(num1, num2);
          break;
        case "/":
          result = calculator.divideNumbers(num1, num2);
          break;
        default:
          throw new IllegalOperatorException();
      }
    } catch (IllegalOperatorException | DivideByZeroException e) {
      System.out.println(e.getMessage());
      in.close();
      return;
    }
    System.out.printf("Результат = %.4f", result);
    
    in.close();
  }
}
