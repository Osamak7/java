import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
	    Definire la classe astratta Automezzo con attributi
	            		numero di ruote
	                    carburante
	                    e con il metodo astratto getMaxSpeed()
	                    Definire due classi figlie di Automezzo: Motociclo e Autovettura
	                    che aggiungono gli attributi cilindrata e consumo
	                    1) Creare una lista di Motociclo e una lista di Autovettura
	                    2) inserire almeno 10 elementi per lista
	                    3) Stampare le liste ordinate (per velocità e poi per consumo)
	                    4) Costruire una nuova lista che contiene contemporaneamente Motocicli e Autovetture
	                    6) Stampare la nuova lista ordinata (per velocità e poi per consumo)
	                    */
		
		LinkedList<Motociclo> liMot = new LinkedList<Motociclo>();
		LinkedList<Auto> liAuto = new LinkedList<Auto>();
		
		Motociclo moto1 = new Motociclo(2, "Elettrica", 1000, 10);
		Motociclo moto2 = new Motociclo(2, "Diesel", 900, 20);
		Motociclo moto3 = new Motociclo(2, "Benzina", 800, 30);
		Motociclo moto4 = new Motociclo(2, "Diesel", 700, 70);
		Motociclo moto5 = new Motociclo(2, "Benzina", 600, 80);
		Motociclo moto6 = new Motociclo(2, "Diesel", 500, 40);
		Motociclo moto7 = new Motociclo(2, "Diesel", 400, 50);
		Motociclo moto8 = new Motociclo(2, "Benzina", 300, 60);
		Motociclo moto9 = new Motociclo(2, "Diesel", 200, 90);
		Motociclo moto10 = new Motociclo(2, "Diesel", 100, 100);
		liMot.add( moto1);
		liMot.add( moto2);
		liMot.add( moto3);
		liMot.add( moto4);
		liMot.add( moto5);
		liMot.add( moto6);
		liMot.add( moto7);
		liMot.add( moto8);
		liMot.add( moto9);
		liMot.add( moto10);
		
		System.out.println(liMot);
		Collections.sort(liMot);
		System.out.println(liMot);
		

	}

}
