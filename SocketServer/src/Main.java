
import java.rmi.server.ServerCloneException;

public class Main {

	public static void main(String[] args) {
		SocketServer srv = new SocketServer();
//per connettersi bisogna fare da terminalein comando = telnet localhost 32456
		//il client e telnet

//while (true) {
		srv.Server(32456);
//}
	}

}
