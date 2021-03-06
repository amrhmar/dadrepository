package Exercise4;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMultilingualApplication {
	
public static void main(String[] args) throws IOException {
		
		ServerSocket serverSocket = null;
		
		try {
			//Bind Serversocket to a port
			int portNo = 4255;
			serverSocket = new ServerSocket(portNo);
			
			String text1 = "Good Morning" + "\t Selamat Pagi" + "\t Sobahul Khair" + "\t Joh-Eun Achim" + "\n" + "Good Night";
			String text2 = "Good Night"+ "\t Selamat Malam" + "\t Tab Masawuk" + "\t Annyeonghi Jumuseyo ";
			String text3 = "Sobahul Khair";
			String text4 = "Joh-Eun Achim";
			System.out.println("Waiting for request");
			
			while (true) {
				
				//Accept client request for connection
				Socket clientSocket = serverSocket.accept();
				
				//Create stream to write data on the network
				DataOutputStream outputStream = new DataOutputStream(clientSocket.getOutputStream());
				
				//Send current date back to the client
				outputStream.writeUTF(text1);
				outputStream.writeUTF(text2);
				outputStream.writeUTF(text3);
				outputStream.writeUTF(text4);
				
				//Close the socket
				clientSocket.close();
			}
			
			// Closing is not necessary because the code is unreachable
		} catch (IOException ioe) {
			if (serverSocket !=null)
				serverSocket.close();
			
			ioe.printStackTrace();
		}
	}
}
