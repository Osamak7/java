
abstract class Prodotto {
	public String name;
	public Double price;
	public String categoria;
	public abstract Double calculateDiscount();
	
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Prodotto [name=" + name + ", price=" + price + ", categoria=" + categoria + "]";
	}

	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public Prodotto(String name, Double price, String categoria) {
		super();
		this.name = name;
		this.price = price;
		this.categoria = categoria;
	}




	
		
	
}
