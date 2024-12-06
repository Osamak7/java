
import java.util.*;

public class ProductApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ProductManager manager = new ProductManager();
		manager.addProdotto(new Elettronica("a", 300.0, "friggitrice"));
		manager.addProdotto( new Elettronica("b", 300.0, "computer"));
		manager.addProdotto( new Elettronica("c", 600.0, "iphone"));
	
		manager.addProdotto(new Abbigliamento("d", 45.0, "Abbigliamento invernale"));
		manager.addProdotto(new Abbigliamento("e", 3.0, "Abbigliamento estivo"));
		manager.addProdotto(new Abbigliamento("f", 30.0, "Abbigliamento Primaverile"));
		

		System.out.println(manager);
		manager.sortProductsByPrice();
		System.out.println(manager);
		
		
		
	}

}
