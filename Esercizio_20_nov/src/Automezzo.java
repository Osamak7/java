
abstract class Automezzo { 
	public Integer numero_ruote;
    public String carburante;
    public abstract Double MaxSpeed();
	
    public Integer getNumero_i_uote() {
		return numero_ruote;
	}
	public void setNumero_i_uote(Integer numero_i_uote) {
		this.numero_ruote = numero_i_uote;
	}
	public String getCarburante() {
		return carburante;
	}
	public void setCarburante(String carburante) {
		this.carburante = carburante;
	}
	
	public Automezzo(Integer numero_i_uote, String carburante) {
		super();
		this.numero_ruote = numero_i_uote;
		this.carburante = carburante;
	}

	@Override
	public String toString() {
		return "numero_i_uote=" + numero_ruote + ", carburante=" + carburante  ;
	}
    
    
}
