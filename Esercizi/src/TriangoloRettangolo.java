
public class TriangoloRettangolo {
	// devo dichiarare attributi/variabili e metodi/funzioni
	private double cat1;
	private double cat2;
	private double ipotenusa;
	private double area;
	private double perimetro;
	

	public double getCat1() {
		return cat1;
	}


	public void setCat1(double cat1) {
		this.cat1 = cat1;
		UpdateFunctionalRelations();
	}


	private void UpdateFunctionalRelations() {
		// TODO Auto-generated method stub
		ipotenusa = Math.sqrt(cat2*cat2 + cat1*cat1);
		area = cat1 * cat2 / 2;
		perimetro = cat1  + cat2 + ipotenusa;
		
	}


	public double getCat2() {
		return cat2;
	}


	public void setCat2(double cat2) {
		this.cat2 = cat2;
		UpdateFunctionalRelations();
	}


	public double getIpotenusa() {
		return ipotenusa;
	}


	public double getArea() {
		return area;
	}


	public double getPerimetro() {
		return perimetro;
	}


	public TriangoloRettangolo(double cat1, double cat2) {
		super();
		this.cat1 = cat1;
		this.cat2 = cat2;
		
		ipotenusa = Math.sqrt(cat2*cat2 + cat1*cat1);
		area = cat1 * cat2 / 2;
		perimetro = cat1  + cat2 + ipotenusa;
	}
	

	
}
