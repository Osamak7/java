
public class Elephante extends Mammifero implements Must, Req , Comparable<Elephante>{
	private Double peso;
	
	
	@Override
	public String toString() {
		return "Elephante [peso=" + peso + ", toString()=" + super.toString() + "]";
	}

	public Elephante(Integer freqResp, Integer freqCardio) {
		super(freqResp, freqCardio);
	}

	public Elephante(Integer freqResp, Integer freqCardio, Double peso) {
		super(freqResp, freqCardio);
		this.peso = peso;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	@Override
	public int compareTo(Elephante o) {
		// TODO Auto-generated method stub
		return peso.compareTo(o.peso);
	}

	@Override
	public String GetClassName() {
		// TODO Auto-generated method stub
		return "Elephante";
	}

	@Override
	public String GetVersion() {
		// TODO Auto-generated method stub
		return "1.0";
	}

	@Override
	public String GetSerial() {
		// TODO Auto-generated method stub
		return "TJ89";
	}

	@Override
	public String Verso() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
