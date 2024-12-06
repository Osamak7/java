
public class Ghepardo extends Mammifero implements Must, Req , Comparable<Ghepardo>{

	@Override
	public String Verso() {
		// TODO Auto-generated method stub
		return "Roarr";
	}
	
	private Double speed;

	@Override
	public String toString() {
		return "Ghepardo [speed=" + speed + ", toString()=" + super.toString() + "]";
	}


	public Double getSpeed() {
		return speed;
	}

	public void setSpeed(Double speed) {
		this.speed = speed;
	}

	public Ghepardo(Integer freqResp, Integer freqCardio, Double speed) {
		super(freqResp, freqCardio);
		this.speed = speed;
	}

	public Ghepardo() {
		super();
	}

	@Override
	public String GetClassName() {
		// TODO Auto-generated method stub
		return "Ghepardo";
	}

	@Override
	public String GetVersion() {
		// TODO Auto-generated method stub
		return "1.0";
	}

	@Override
	public String GetSerial() {
		// TODO Auto-generated method stub
		return "AI48";
	}


	@Override
	public int compareTo(Ghepardo o) {
		// TODO Auto-generated method stub
	 Integer ret = speed.compareTo(o.speed);
	 if (ret != 0) {
		 return ret;
	 }
	 else {
		 return getFreqCardio().compareTo(o.getFreqCardio());
	 }
	}
	
	

}
