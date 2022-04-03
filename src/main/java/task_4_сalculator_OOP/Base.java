package task_4_сalculator_OOP;

import java.util.Scanner;

public class Base {
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
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
    Operation op;
    switch (operation) {
      case "+":
        op = new Addition(num1, num2);
        break;
      case "*":
        op = new Multiplication(num1, num2);
        break;
      case "-":
        op = new Subtraction(num1, num2);
        break;
      case "/":
        op = new Division(num1, num2);
        break;
      default:
        System.out.println("Введенная операция не поддерживается. Попробуйте снова, используя знаки +, *, -, /.");
        in.close();
        return;
    }
    System.out.printf("Результат = %.4f", op.compute());
    in.close();
  }
}
