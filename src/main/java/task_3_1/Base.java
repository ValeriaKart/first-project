package task_3_1;

import java.util.Arrays;
import java.util.Random;

public class Base {
  public static void main(String[] args) {
    Random random = new Random();
    // Создание массива на 20 целых чисел
    int[] array = new int[20];
  
    // Заполнение массива случайными целыми числами в диапазоне от -10 до 10
    for (int i = 0; i < array.length; i++) {
      array[i] = random.nextInt(21) - 10;
    }
  
    System.out.println("Сгенерированный массив случайных целых чисел:\n" + Arrays.toString(array));
    
     int maxNegativeValue = -10;
     int minPositiveValue = 10;
     int maxNegativeValueIndex = 0;
     int minPositiveValueIndex = 0;
     
   // Перебор массива для поиска максимального отрицательного и минимального положительного чисел и их индексов
    for (int i = 0; i < array.length; i++) {
      if(array[i] < 0){
        if(array[i] > maxNegativeValue){
          maxNegativeValue = array[i];
          maxNegativeValueIndex = i;
        }
      }else if (array[i] > 0) {
        if (array[i] < minPositiveValue) {
          minPositiveValue = array[i];
          minPositiveValueIndex = i;
        }
      }
    }
    System.out.println("Максимальное отрицательное число: " + maxNegativeValue + ", его порядковый номер: " + (maxNegativeValueIndex + 1) +
      "\nМинимальное положительное число: " + minPositiveValue + ", его порядковый номер: " + (minPositiveValueIndex + 1) );
    
    //Меняются местами в массиве максимальное отрицательное и минимальное положительное числа
    array[maxNegativeValueIndex] = minPositiveValue;
    array[minPositiveValueIndex] = maxNegativeValue;
  
    System.out.println("Массив с помененными местами максимальным отрицательным и минимальным положительным числами:\n" + Arrays.toString(array));
  }
}
