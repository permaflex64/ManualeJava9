package capitolo_15.esempi.paragrafo_15_5;
public class Producer implements Runnable {
  private GeneralWareHouse wareHouse;
    public Producer(GeneralWareHouse wareHouse) {
    this.wareHouse = wareHouse;
    new Thread(this, "Producer").start();
  }
  public void run() {
    for (int i = 1; i <= 1000; i++) {
      wareHouse.put(i);
    }
  }
}