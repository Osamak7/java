import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Locale;

public class MyThread extends Thread {
    private long num;

    public void run() {
//        while (num-- > 0) {
//            System.out.println("Thread id: " + getId()+ 
//            		". Num: "+num);// getID() e tagliata poiche sara deprecata 
//        }
    
    while (true) {
    	System.out.println(LocalTime.now());
    	try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
    }
    }

    public MyThread(long num) {
        super();
        this.num = num;
    }
}
