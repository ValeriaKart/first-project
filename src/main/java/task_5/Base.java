package task_5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

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
  
    HashMap<String, Integer> wordsQuantity = new HashMap<>();
    
    for(int i = 0; i < wordsList.size(); i++){
      if(wordsQuantity.containsKey(wordsList.get(i))){
        wordsQuantity.put(wordsList.get(i), wordsQuantity.get(wordsList.get(i)) + 1);
      }else{
        wordsQuantity.put(wordsList.get(i), 1);
      }
    }
    System.out.println("Список слов и их количество в файле: " + wordsQuantity);
    
  
    Integer maxValue2 = 0;
    String maxUsedWord = null;
    
     for (Map.Entry<String, Integer> pairKeyValue : wordsQuantity.entrySet()) {
     if (pairKeyValue.getValue() > maxValue2){
       maxUsedWord = pairKeyValue.getKey();
       maxValue2 = pairKeyValue.getValue();
     }
    }
    System.out.println("Наиболее часто втречающееся слово: " + maxUsedWord + ". Встречается в файле " + maxValue2 + " раз.");
  }
}
