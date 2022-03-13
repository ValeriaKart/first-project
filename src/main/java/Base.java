import java.util.Scanner;

public class Base {

    public static void main(String[] args) {
        //Создаем объект класса Scanner для считывания значений с консоли и сохраняем в переменную in
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите операцию. Введите знак + для сложения, знак * для умножения");
        //Сохраняем в переменную operationType значение типа операции из консоли, возвращенное методом next()
        String operationType = in.next();

        //Выводим пользователю просьбу ввести числа в консоль и сохраняем значения в переменные num1 и num2
        System.out.println("Введите первое число в виде десятичной дроби с разделителем запятой:");
        double num1 = in.nextDouble();
        System.out.println("Введите второе число в виде десятичной дроби с разделителем запятой:");
        double num2 = in.nextDouble();

        /*Условие для выбора операции с введенными числами. Если "+" - сложение,
        "*" - умножение, иначе сообщение, что операция не поддерживается*/
        if (operationType.equals("+")) {
            System.out.printf("Результат = %.4f", additionCalculator(num1, num2));
        } else if (operationType.equals("*")) {
            System.out.printf("Результат = %.4f", multiplyCalculator(num1, num2));
        } else {
            System.out.println("Введенная операция не поддерживается. Попробуйте снова, используя знаки + или *.");
        }
    }

    /**
     *
     * @param number1 - первое число в виде десятичной дроби с разделителем запятой
     * @param number2 - второе число в виде десятичной дроби с разделителем запятой
     * @return метод возвращает результат сложения двух чисел (number1 и number2)
     */
    public static double additionCalculator(double number1, double number2) {

        return number1 + number2;
    }

    /**
     *
     * @param number1 - первое число в виде десятичной дроби с разделителем запятой
     * @param number2 - второе число в виде десятичной дроби с разделителем запятой
     * @return метод возвращает результат умножения двух чисел (number1 и number2)
     */
    public static double multiplyCalculator(double number1, double number2) {

        return number1 * number2;

    }
}
