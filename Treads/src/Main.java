import java.awt.desktop.ScreenSleepListener;
import java.awt.desktop.SystemSleepEvent;
import java.sql.Time;
import java.util.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
        

	    Supponiamo di avere un DB con una tabella (Unique) 
	        che contiene un solo record di un solo 
	            attributo (ID) numerico.
	                Quello che dovete fare è una procedura che
	                    1) accede alla tabella per leggere ID
	                    2) incrementare ID di 1
	                    3) aggiornare la tabella
	                    4) stampare l'ID
	                    NB: dovete assicurarvi che anche in caso di
	                    accessi multipli al DB, i numeri stampati siano
	                    sempre unici, senza cioè duplicazioni
	                    
	                    
	                    *un programma che ogni secondo legga un riga di un file e chieda cosa vuole fare l'utente 
	                    *un menu 
	                    *
	                    */


		
//		MyThread th1 = new MyThread(100);
//		th1.start();
//		
//		MyThread th2 = new MyThread(100);
//		th2.start();//chiama start che a sua volta richiame run in questo  (Start non e sequenziale a differenza di run)

		 //System.exit(0);// 0  return al sistema operativo se e andato tutto bene 
		
		GenID id1 = new GenID();
		id1.start();
		
		GenID id2 = new GenID();
		id2.start();
	}

}
