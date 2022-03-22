import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

public class Array {
  private final Scanner in;
  
  public Array(Scanner in) {
    this.in = in;
  }
  
  public void start() {
    System.out.println("Введите количество элементов массива:");
    int elementsQuantity = in.nextInt();
    
    String[] stringArray = new String[elementsQuantity];
    
    System.out.println("Введите произвольные слова количеством " + elementsQuantity);
    //StringBuilder str = new StringBuilder();
    
    for (int i = 0; i < elementsQuantity; i++) {
      stringArray[i] = in.next();
    }
    System.out.println(Arrays.toString(stringArray));
    
    String maxWord = findLongestWord(stringArray, elementsQuantity);
    System.out.println("Самое длинное слово(а): " + maxWord);
    
    in.close();
  }
  
  private String findLongestWord(String[] array, int elementsQuantity) {
    int maxLength = array[0].length();
    //String maxWord = array[0];
    StringJoiner maxWord = new StringJoiner(", ");
    
    for (int i = 0; i < elementsQuantity; i++) {
      if (maxLength <= array[i].length()) {
        maxWord.add(array[i]);
        // а если таких слов несколько stringBuilder?
      }
    }
    return maxWord.toString();
  }
}
