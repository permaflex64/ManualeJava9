package capitolo_15.esempi.paragrafo_15_5;
public class IdealEconomy {
  public static void main(String args[]) {
    WareHouse wareHouse = new WareHouse();
    new Producer(wareHouse);
    new Consumer(wareHouse);
  }
}