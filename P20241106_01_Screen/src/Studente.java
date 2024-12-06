
public class Studente extends Persona {
	private String corso;
	private int AnnoDiFrequenza;
	
	public Studente(String nome, int eta, String corso, int annoDiFrequenza) {
		super(nome, eta);
		this.corso = corso;
		AnnoDiFrequenza = annoDiFrequenza;
		
	}

	public String getCorso() {
		return corso;
	}

	public void setCorso(String corso) {
		this.corso = corso;
	}

	public int getAnnoDiFrequenza() {
		return AnnoDiFrequenza;
	}

	public void setAnnoDiFrequenza(int annoDiFrequenza) {
		AnnoDiFrequenza = annoDiFrequenza;
	}

	
	public String toString() {
		return "Studente [corso=" + corso + ", AnnoDiFrequenza=" + AnnoDiFrequenza + "]";
	}
	
	

}
