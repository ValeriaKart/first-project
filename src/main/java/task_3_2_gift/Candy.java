package task_3_2_gift;

public class Candy extends Sweet {
  private String shape;
  
  
  public Candy(String name, double weight, double price, String shape) {
    super(name, weight, price);
    this.shape = shape;
  }
  
  public String description(){
     return "Конфеты " + getName() + " весом " + getWeight() + " г. по цене " + getPrice() + " руб., форма = " + getShape() + "\n";
  }
  
  public String getShape() {
    return shape;
  }
}
