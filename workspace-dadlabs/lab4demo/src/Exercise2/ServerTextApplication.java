package Exercise2;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTextApplication {
	
public static void main(String[] args) {
		
		
		// Launch the server frame
		ServerTextFrame serverFrame = new ServerTextFrame();
		serverFrame.setVisible(true);
		
		try {
			
			// Bind Serversocket to a port
			int portNo = 4228;
			ServerSocket serverSocket = new ServerSocket(portNo);

			TextGenerator textGenerator = new TextGenerator();

			// Counter to keep track the number of requested connection
			int totalRequest = 0;

			// Server need to be alive forever
			while (true) {

				// Accept client request for connection
				Socket clientSocket = serverSocket.accept();

				// Get text
				String text = "BITP3123 Distributed Application Development is the best subject! :)";


				// Create stream to write data on the network
				DataOutputStream outputStream = 
						new DataOutputStream(clientSocket.getOutputStream());

				// Send text back to the client
				outputStream.writeBytes(text);

				// Close the socket
				clientSocket.close();


				// Update the request status
				serverFrame.updateRequestStatus("Data sent to the client: " 
						+ text);
				serverFrame.updateRequestStatus(
						"Accepted connection from the client.  "
						+ "Total request =" + ++totalRequest);
			}
			
		} catch (Exception exception) {

			System.out.println("We got problem.");
			exception.printStackTrace();

		}
		

	}

}
