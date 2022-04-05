package task_5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Base {
  public static void main(String[] args) throws FileNotFoundException {
    File doc =
      new File("C:\\Users\\user\\Desktop\\courses\\Java\\java_advanced\\exFile.txt");
    Scanner in = new Scanner(doc);
  
    ArrayList<String> wordsList = new ArrayList<>();
    while (in.hasNextLine())
    {
      String line = in.nextLine();
      String[] splits = line.split(" ");
      wordsList.addAll(Arrays.asList(splits));
    }
    wordsList.sort(Comparator.naturalOrder());
    System.out.println("Слова из файла в алфавитном порядке: " + wordsList);
    
  }
}
