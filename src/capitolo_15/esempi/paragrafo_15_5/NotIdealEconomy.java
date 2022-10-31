package capitolo_15.esempi.paragrafo_15_5;
public class NotIdealEconomy {
  public static void main(String args[]) {
    BadWareHouse wareHouse = new BadWareHouse();
    new Producer(wareHouse);
    new Consumer(wareHouse);
  }
}