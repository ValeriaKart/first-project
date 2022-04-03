package task_3_2_gift;

public class Base {
  public static void main(String[] args) {
  Gift gift = new Gift();
  gift.addSweet(new Candy("Tic Tac", 11.22, 45.99, "круглые"));
  gift.addSweet(new JellyBeen("Gummy Bears", 200.35, 170.33, "зеленый"));
  gift.addSweet(new JellyBeen("Gummy Bears", 150.55, 120.90, "желтый"));
  gift.printSweet();
  System.out.printf("Общий вес подарка = %.2f г. \n", gift.getTotalWeight());
  System.out.printf("Общая цена подарка = %.2f руб. ", gift.getTotalPrice());
  }
}
