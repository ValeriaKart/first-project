package task_3_2_gift;

import java.util.ArrayList;

public class Gift {
  private double totalWeight = 0;
  private double totalPrice = 0;
  ArrayList<Sweet> sweetArray = new ArrayList<Sweet>();
  
  public void addSweet(Sweet sweet){
    sweetArray.add(sweet);
    totalPrice +=sweet.getPrice();
    totalWeight +=sweet.getWeight();
  }
  
  public void printSweet(){
    for (int i = 0; i < sweetArray.size(); i++){
      System.out.println(sweetArray.get(i).description());
    }
    
  }
  
  public double getTotalWeight() {
    return totalWeight;
  }
  
  public double getTotalPrice() {
    return totalPrice;
  }
  
}


