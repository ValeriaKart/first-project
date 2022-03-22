import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

public class Array {
  private final Scanner in;
  
  public Array(Scanner in) {
    this.in = in;
  }
  
  /**
   * метод выводит на консоль самое длинное слово в массиве,
   * полученное вызовом метода findLongestWord(String[] array, int elementsQuantity)
   */
  
  public void start() {
    System.out.println("Введите количество элементов массива:");
    int elementsQuantity = in.nextInt();
    
    String[] stringArray = new String[elementsQuantity];
    
    System.out.println("Введите произвольные слова количеством " + elementsQuantity);
    
    // заполнение массива введенными с консоли значениями
    for (int i = 0; i < elementsQuantity; i++) {
      stringArray[i] = in.next();
    }
    //System.out.println(Arrays.toString(stringArray));
    
    String maxWord = findLongestWord(stringArray, elementsQuantity);
    System.out.println("Самое длинное слово: " + maxWord);
    
    in.close();
  }
  
  
  /**
   *
   * @param array массив строковых значений
   * @param elementsQuantity количество элементов в массиве
   * @return возвращает самое длинное слово в массиве
   */
  private String findLongestWord(String[] array, int elementsQuantity) {
    int maxLength = array[0].length();
    String maxWord = array[0];
    
    for (int i = 0; i < elementsQuantity; i++) {
      if (maxLength < array[i].length()) {
        maxWord = array[i];
        maxLength = array[i].length();
      }
    }
    return maxWord;
  }
}
