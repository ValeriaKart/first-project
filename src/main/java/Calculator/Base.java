package Calculator;

import java.io.IOException;
import java.util.Scanner;

public class Base {
  public static void main(String[] args) throws DivideByZeroException {
    double num1;
    double num2;
    
    Scanner in = new Scanner(System.in);
    
    System.out.println("Выберите операцию. Введите знак \"+\" для сложения, знак \"*\" для умножения, " +
      "\"-\" - вычитания, \"/\" - деления ");
    // Сохраняем в переменную operation значение типа операции из консоли, возвращенное методом next()
    String operation = in.next();
    
    // Выводим пользователю просьбу ввести числа в консоль и сохраняем значения в переменные num1 и num2
    System.out.println("Введите первое число в виде десятичной дроби с разделителем запятой:");
    num1 = in.nextDouble();
    System.out.println("Введите второе число в виде десятичной дроби с разделителем запятой:");
    num2 = in.nextDouble();
    
    Calculator calculator = new Calculator();
    
    /*Условие для выбора операции с введенными числами. Если "+" - сложение,
        "*" - умножение, "-" - вычитание, "\" - деление. Иначе сообщение, что операция не поддерживается*/
    double result;
    
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
        System.out.println("Введенная операция не поддерживается. Попробуйте снова, используя знаки +, *, -, /.");
        in.close();
        return;
    }
    System.out.printf("Результат = %.4f", result);
    
      in.close();
  }
}
