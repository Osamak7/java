
public class Elettronica extends Prodotto implements Comparable<Elettronica>{

	public Elettronica(String name, Double price, String categoria) {
		super(name, price, categoria);
		// TODO Auto-generated constructor stub
	}



	@Override
	public Double calculateDiscount() {
		// TODO Auto-generated method stub
		if(price > 500.0) {
			setPrice(price-((price * 10) / 100));
			return (price * 10) / 100;
		}

		
		return 0.0;
	}
	
	public int compareTo(Elettronica el) {
		// TODO Auto-generated method stub
	 Integer ret = price.compareTo(el.price);
	 if (ret != 0) {
		 return ret;
	 }
	 else {
		 return getPrice().compareTo(el.getPrice());
	 }

	}
	
}
