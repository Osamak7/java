import java.util.Scanner;

public class Contatore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);
		int count = 0;
		int start = myObj.nextInt();
		while (count <10) {
			start ++;
			System.out.println(start);
			count ++;
		};
		
	}

}
