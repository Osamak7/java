
public class CreateComputer {
	double prezzo ;
	double peso;
	double larghezza;
	double altezza;
	double profondita;
	String produttore;
	int annoProduzione;
	
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getLarghezza() {
		return larghezza;
	}
	public void setLarghezza(double larghezza) {
		this.larghezza = larghezza;
	}
	public double getAltezza() {
		return altezza;
	}
	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}
	public double getProfondita() {
		return profondita;
	}
	public void setProfondita(double profondita) {
		this.profondita = profondita;
	}
	public String getProduttore() {
		return produttore;
	}
	public void setProduttore(String produttore) {
		this.produttore = produttore;
	}
	public int getAnnoProduzione() {
		return annoProduzione;
	}
	public void setAnnoProduzione(int annoProduzione) {
		this.annoProduzione = annoProduzione;
	}
	
	public CreateComputer (double prezzo, double peso,double larghezza, double altezza, double profondita , String produttore, int annoProduzione) {
		this.prezzo= prezzo;
		this.altezza=altezza;
		this.annoProduzione= annoProduzione;
		this.larghezza = larghezza;
		this.peso = peso;
		this.produttore = produttore;
		this.profondita= profondita;
		
	}
	 
}
