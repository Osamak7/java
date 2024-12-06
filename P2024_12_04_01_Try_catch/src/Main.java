import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rng = new Random();
		for (int i= 0; i< 100; i++) {
			Integer num = Dividi(rng.nextInt(10), rng.nextInt(10));
			//System.out.println(num);
			
		}
		
	
	}

	private static Integer Dividi(int i, int j) {
		// TODO Auto-generated method stub
		try {
			Integer q = i/j;
			System.out.print("ok ");
			return q;
		}catch (Exception ex) {
			//ex.printStackTrace();
			System.out.print("ko ");
			return null;
		}
		finally {
			System.out.println("eh eh eh");
		}
		
		
		}

}
