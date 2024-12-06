
public class Abbigliamento extends Prodotto implements Comparable<Abbigliamento>{

	public Abbigliamento(String name, Double price, String categoria) {
		super(name, price, categoria);
		// TODO Auto-generated constructor stub
	}


	@Override
	public Double calculateDiscount() {
		// TODO Auto-generated method stub
		if(Abbigliamento.this.getCategoria()  == "Abbigliamento invernale") {
			setPrice(price-((price * 15) / 100));
			return(price * 15) / 100;
		}
		
		
		return 0.0;
	}
		
	
	
	public int compareTo(Abbigliamento ab) {
		// TODO Auto-generated method stub
	 Integer ret = price.compareTo(ab.price);
	 if (ret != 0) {
		 return ret;
	 }
	 else {
		 return getPrice().compareTo(ab.getPrice());
	 }
	}
}
