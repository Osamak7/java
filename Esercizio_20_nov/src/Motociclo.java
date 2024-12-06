
public class Motociclo  extends Automezzo implements  Comparable<Motociclo>{

	Integer cilindrata;
	Integer consumo;
	
	

	public Motociclo(Integer numero_i_uote, String carburante, Integer cilindrata, Integer consumo) {
		super(numero_i_uote, carburante);
		this.cilindrata = cilindrata;
		this.consumo = consumo;
	}


	@Override
	public Double MaxSpeed() {
		// TODO Auto-generated method stub
		return 200.50;
	}

	public Integer getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(Integer cilindrata) {
		this.cilindrata = cilindrata;
	}

	public Integer getConsumo() {
		return consumo;
	}

	public void setConsumo(Integer consumo) {
		this.consumo = consumo;
	}

	@Override
	public String toString() {
		return "Motociclo [cilindrata=" + cilindrata + ", consumo=" + consumo + ", " + super.toString()
				+ "]\n";
	}
	public int compareTo(Motociclo o) {
		// TODO Auto-generated method stub
	 Integer ret = cilindrata.compareTo(o.cilindrata);
	 if (ret != 0) {
		 return ret;
	 }
	 else {
		 return getConsumo().compareTo(o.getConsumo());
	 }
	}
	
}
