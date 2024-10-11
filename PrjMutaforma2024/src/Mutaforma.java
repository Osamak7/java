
public class Mutaforma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Somma(10, 20);
		System.out.println(a);
		
		double b = Somma(10.1, 20.0);
		System.out.println(b);
		
		String s = Somma("buona ","sera");
		System.out.println(s);
	}

	private static String Somma(String str1, String str2) {
		// TODO Auto-generated method stub
		return str1+str2;
	}

	private static double Somma(double d, double e) {
		// TODO Auto-generated method stub
		return d+e;
	}

	private static int Somma(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}

}
