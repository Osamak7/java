import java.util.Random;

public class Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		for (int i=0; i<10; i++) {
			String nome = GenerateString(rand.nextInt(2,10));
			String cognome = GenerateString(rand.nextInt(2,10));
			int eta = rand.nextInt(50);
			GeneratePersona p = new GeneratePersona(nome, cognome, eta);
			System.out.println("nome= "+p.nome+ " cognome= "+ cognome+ " eta= "+eta);
		}
		
		System.out.println("numero persone : "+GeneratePersona.numeroPersone);
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







