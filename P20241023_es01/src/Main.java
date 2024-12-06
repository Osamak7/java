import java.lang.foreign.AddressLayout;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arrInt = new int [100];
		double [] arrDouble = new double [100];
		System.out.println(arrInt.toString());
		System.out.println(arrDouble.toString());
		
		for (int i = 0 ; i < 100; i++) {
			arrInt [i] = i + 1;
		}
		for (int i = 100; i> 0; i--){
			arrInt[i-1] = i; 
		}

		for (int i = 0 ; i  < 100 ; i++) {
		
			arrInt[i] = (i+1)*2;	
		}
		
		StampArr(arrInt);
		
		arrInt[0] = 1;
		arrInt[1]= 1;
		for (int i = 2 ; i < 100; i++) {
			arrInt[i] = arrInt[i-1] + arrInt[i-2];
		}
		StampArr(arrInt);
		
		//i primi 10000 numeri primi
		//ratostene(100000000);
		System.out.println();
		System.out.println(Fattoriale(15));
		
	
	}
	private static int Fattoriale(int N) {
		// TODO Auto-generated method stub
		int p=1;
		for (int i= 2; i<=N; i++) {
			p= p*i;
		}
		return p;
	}
	
	
	
	private static void Eratostene(int N) {
		boolean [] v = new boolean[1000000000];
		
		for (int i= 2; i< v.length; i++) {
			v[i] = true;
		}
		for(int i= 2 ; i<v.length; i++) {
			if (v[i] == true) {
				System.out.println(i + " é un numero primo");
				
				for(int k=i+i;k< v.length ; k+=i ) {
					v[k] = false;
					
				}
			}
		}
	}
	
	public static <Anytype> void StampArr(Anytype arrInt) {
		System.out.println();
		for (int i = 0; i < 100; i++) {
			System.out.print(arrInt[i] + " ");
		}
	}
	
}
