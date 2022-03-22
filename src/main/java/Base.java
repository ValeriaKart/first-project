import java.util.Scanner;

public class Base {

    public static void main(String[] args) {
        //Создаем объект класса Scanner для считывания значений с консоли и сохраняем в переменную in
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите операцию. Введите 1 для выбора калькулятора, 2 для поиска элемента в массиве");
        //Сохраняем в переменную operationType значение типа операции из консоли, возвращенное методом nextInt()
        int operationType = in.nextInt();



        in.close();
    }


}
