import java.util.Scanner;

public class Base {
  
  public static void main(String[] args) {
    // Создаем объект класса Scanner для считывания значений с консоли и сохраняем в переменную in
    Scanner in = new Scanner(System.in);
    System.out.println("Выберите операцию. Введите 1 для выбора калькулятора, 2 для поиска максимального слова в массиве");
    // Сохраняем в переменную operationType значение типа операции из консоли, возвращенное методом nextInt()
    int operationType = in.nextInt();
    
    // Условие для выбора действия. 1 - калькулятор, 2 - поиск максимального слова в массиве
    if (operationType == 1) {
      Calculator calculator = new Calculator(in);
      calculator.start();
    } else if (operationType == 2) {
      Array array = new Array(in);
      array.start();
    } else {
      System.out.println("Операция не поддерживается. Выберите 1 - калькулятор или 2 - поиск максимального слова в массиве");
      in.close();
    }
    
  }
}
