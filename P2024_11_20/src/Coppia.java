
public class Coppia <T1, T2> {
	private T1 n1;
	private T2 n2;
	
	
	public T1 getN1() {
		return n1;
	}
	public void setN1(T1 n1) {
		this.n1 = n1;
	}
	public T2 getN2() {
		return n2;
	}
	public void setN2(T2 n2) {
		this.n2 = n2;
	}
	@Override
	public String toString() {
		return "Coppia [n1=" + n1 + ", n2=" + n2 + "]";
	}
	public Coppia(T1 n1, T2 n2) {
		super();
		this.n1 = n1;
		this.n2 = n2;
	}
	public Coppia() {
		super();
	}
	
	
	
}
