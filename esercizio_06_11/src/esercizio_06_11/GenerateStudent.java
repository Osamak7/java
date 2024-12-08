package esercizio_06_11;

public class GenerateStudent {
	String nome;
	String cognome;
	int eta;
	String matricola;
	static int totStud = 0;
	
	public int getTotStud() {
		return totStud;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public int getEta() {
		return eta;
	}
	
	public void setEta(int eta) {
		this.eta = eta;
	}
	
	public String getMatricola() {
		return matricola;
	}
	
	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	public GenerateStudent(String nome, String cognome, int eta, String matricola) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta= eta;
		this.matricola = matricola;
		GenerateStudent.totStud ++;
	}
	
	
}
