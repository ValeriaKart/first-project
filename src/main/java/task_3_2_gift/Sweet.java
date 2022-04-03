package task_3_2_gift;

public abstract class Sweet {
  private String name;
  private double weight;
  private double price;
  
  public Sweet(String name, double weight, double price) {
    this.name = name;
    this.weight = weight;
    this.price = price;
  }
  
  public Sweet(String name) {
    this.name = name;
  }
  
  public abstract String description();
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public double getWeight() {
    return weight;
  }
  
  public void setWeight(double weight) {
    this.weight = weight;
  }
  
  public double getPrice() {
    return price;
  }
  
  public void setPrice(double price) {
    this.price = price;
  }
}
