package Exercise4ClientSide;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

public class ClientMultilingualApplication {

	
public static void main(String[] args) {
		
		try {
			// Connect to the server at localhost, port 4236
			Socket socket = new Socket(InetAddress.getLocalHost(), 4255);
			
			// Create input stream 
			BufferedReader bufferedReader = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			
			// Read from the network and display the current date
			String text = bufferedReader.readLine();
			System.out.println(text);
			
			// Close everything
			bufferedReader.close();
			socket.close();
			
		} catch (IOException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
