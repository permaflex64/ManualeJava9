package capitolo_15.esempi.paragrafo_15_2;
public class ThreadExists {
    public static void main(String args[]) {
        Thread t = Thread.currentThread();
        t.setName("Thread principale");
        t.setPriority(10);
        System.out.println("Thread in esecuzione: "+ t);
        try {
            for (int n = 5; n > 0; n--) {
                System.out.println(""+ n);
                t.sleep(1000);  
            }
        }
        catch (InterruptedException e) {
            System.out.println("Thread interrotto");
            
        }
    }
}