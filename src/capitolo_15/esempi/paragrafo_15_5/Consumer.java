package capitolo_15.esempi.paragrafo_15_5;
public class Consumer implements Runnable {
  private GeneralWareHouse wareHouse;
  public Consumer(GeneralWareHouse wareHouse) {
    this.wareHouse = wareHouse;
    new Thread(this, "Consumer").start();
  }
  public void run() {
    for (int i = 0; i < 10;) {
      i = wareHouse.get();
    }
  }
}