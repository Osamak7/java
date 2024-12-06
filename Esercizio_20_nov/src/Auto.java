
public class Auto extends Automezzo{

	double cilindrata;
	String consumo;
	
	public Auto(Integer numero_i_uote, String carburante) {
		super(numero_i_uote, carburante);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double MaxSpeed() {
		// TODO Auto-generated method stub
		return 30.0;
	}

	@Override
	public String toString() {
		return "Auto [cilindrata=" + cilindrata + ", consumo=" + consumo + ", toString()=" + super.toString() + "]";
	}

	public double getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(double cilindrata) {
		this.cilindrata = cilindrata;
	}

	public String getConsumo() {
		return consumo;
	}

	public void setConsumo(String consumo) {
		this.consumo = consumo;
	}
	

}
