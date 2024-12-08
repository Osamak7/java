import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.println("a che piano devo andare [0,1,2,3]");
			int piano = scn.nextInt();
			Macchina(piano);	
		}
		
	}
	static int stato = 0;
	
	private static void Macchina(int piano) {
		// TODO Auto-generated method stub
		int differenza = Math.abs(stato - piano);
		String st = "";
		if (stato > piano) {
			st= "inferiore";
		}
		else {
			st ="superiore";
		}
		
		System.out.printf("Sono al piano %d e devo andare al piano %d  il piano che hai scelto sta a %d piani %s da quello desiderato ",stato , piano, differenza, st);
		stato = piano ;
		
	
	}

}
