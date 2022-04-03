package task_3_2_gift;

public class JellyBeen extends Sweet{
  private String colour;
  
  public JellyBeen(String name, double weight, double price, String colour) {
    super(name, weight, price);
    this.colour = colour;
  }
  
  public String description(){
    return "Мармеладки " + getName() + " весом " + getWeight() + " г. по цене " + getPrice() + " руб., цвет = " + getColour() + "\n";
  }
  
  public String getColour() {
    return colour;
  }
}
