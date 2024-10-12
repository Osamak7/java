package es1;

public class Esercizio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double cateto1 = 45.3;
		double cateto2 = 67.2;
		
		double ipotenusa = Math.sqrt((cateto1 * cateto1)+ (cateto2*cateto2));
		double area = (cateto1 * cateto2)/2;
		double perimetro = cateto1 + cateto2 + ipotenusa;
		System.out.println("Cateto1= "+ cateto1 + " , Cateto2= "+ cateto2);
		System.out.println("ipotenusa= "+ipotenusa);
		System.out.println("area= "+area);
		System.out.println("perimetro= "+perimetro);
		System.out.println();
		double raggioCer =  (ipotenusa * (3.0/4));
		double circonferCer = (raggioCer * 2 ) * 3.14 ;
		double areaCer = 3.14 *(raggioCer * raggioCer);
		
		System.out.println("circonferenza Cerhio  ="+circonferCer);
		System.out.println("area Cerchio ="+ areaCer);
	}

}
