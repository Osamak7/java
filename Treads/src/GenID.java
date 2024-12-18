import java.util.concurrent.locks.ReentrantLock;

import javax.swing.plaf.multi.MultiTextUI;

public class GenID extends Thread {
	private static ReentrantLock look = new ReentrantLock();
	static long ID=0;

	
	public void run() {
		while(true) {
			look.lock();
			System.out.println(ID);
			//per simulare un minimo di tempo di calcolo
			try {
				Thread.sleep(100);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ID++;
			look.unlock();
			try {
				Thread.sleep(100);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}
}
