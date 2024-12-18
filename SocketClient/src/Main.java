
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SocketClient client = new SocketClient();
		client.Run("localhost", 32456);
		client.Run("www.google.com",8080);
	}

}
