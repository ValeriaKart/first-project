import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите операцию. Введите знак + для сложения, знак * для умножения");
        String operationType = in.next();

        System.out.println("Введите первое число в виде десятичной дроби с разделителем запятой:");
        double num1 = in.nextDouble();
        System.out.println("Введите второе число в виде десятичной дроби с разделителем запятой:");
        double num2 = in.nextDouble();

        if (operationType.equals("+")) {
            System.out.printf("Результат = %.4f", additionCalculator(num1, num2));
        } else if (operationType.equals("*")) {
            System.out.printf("Результат = %.4f", multiplyCalculator(num1, num2));
        } else {
            System.out.println("Введенная операция не поддерживается. Попробуйте снова, используя знаки + или *.");
        }
    }

    public static double additionCalculator(double number1, double number2) {
        return number1 + number2;
    }

    public static double multiplyCalculator(double number1, double number2) {

        return number1 * number2;

    }
}
