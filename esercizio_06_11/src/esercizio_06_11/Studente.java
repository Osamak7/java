package esercizio_06_11;

import java.util.Random;
import java.util.Scanner;

public class Studente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		
		Scanner inp = new Scanner(System.in);
		System.out.println("quanti studenti vuoi creare : ");
		int numPersone = inp.nextInt(); 
		String [] studenti = {};
		for (int i = 0; i< numPersone; i++) {
			String nome = GenerateString(rand.nextInt(2,10));
			String cognome = GenerateString(rand.nextInt(2,10));
			int eta = rand.nextInt(15,30);// da 15 a 30 anni
			String matricola = GenerateString(rand.nextInt(5,15));
			
			GenerateStudent p = new GenerateStudent(nome, cognome, eta, matricola);
			System.out.println("nome= "+p.nome+ " cognome= "+ cognome+ " eta= "+eta+ " matricola= "+matricola);
		}
		
		
		
			
	}

	
	
	public static String GenerateString( int inp) {
		
		String alphaMin = "abcdefghijklmnopqrstuvwxyz";
		String alphaMai = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String num = "0123456789";
		
		String alpha = alphaMin + alphaMai + num ;
		String result = "";
		Random rand = new Random();
		
		for(int i = 0; i <inp; i++) {
			// imposto la lunghezza dell alpha in modo che possa scegliere un carattere da tutta la stringa
			result += alpha.charAt(rand.nextInt(alpha.length()));
		}
		return result;
		
		
	}
	
	
}
