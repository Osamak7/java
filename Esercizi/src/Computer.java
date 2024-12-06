import java.util.Random;


public class Computer {
    public static void main(String[] args) {
        Random rand = new Random();
        
        
        for (int i=0; i < 10; i++) {
        	double prezzo = rand.nextDouble() *100; 
        	double peso = rand.nextDouble()*30;
        	double larghezza = rand.nextDouble()*20;
        	double altezza = rand.nextDouble()*20;
        	double profondita = rand.nextDouble()*20;
        	String produttore = GeneraStringaRandom(rand.nextInt(10));
        	int annoProduzione = 2000 + rand.nextInt(25);
        	
        	CreateComputer comp = new CreateComputer(prezzo, peso, larghezza, altezza, profondita , produttore, annoProduzione);
        	System.out.println("*********************************************************");
        	System.out.printf("* %-53s *\n",comp.prezzo);
        	System.out.printf("* %-53s *\n",comp.peso);
        	System.out.printf("* %-53s *\n",comp.larghezza);
        	System.out.printf("* %-53s *\n",comp.altezza);
        	System.out.printf("* %-53s *\n",comp.profondita);
        	System.out.printf("* %-53s *\n",comp.produttore);
        	System.out.printf("* %-53s *\n",comp.annoProduzione);
        	System.out.println("*********************************************************\n");
        	
        }
        System.out.println(CreateComputer.getNumeroComputer());
        
        
    }

    static public String GeneraStringaRandom(int len) {
		String minuscole = "abcdefghijklmnopqrstuvwxyz";
		String maiuscole = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String numeri = "0123456789";
		String speciali = ",.-;:_@#§°[]{}+^'?=)(/&%$£\"!\\|<>";

		String all = minuscole + maiuscole + numeri + speciali;
		String res = "";

		for (int i = 0; i < len; i++) {
			res += all.charAt((int) (Math.random() * all.length()));
		}
		return res;
	}
}
