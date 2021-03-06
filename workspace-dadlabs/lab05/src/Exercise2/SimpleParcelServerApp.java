package Exercise2;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import Exercise2.Parcel;
import Exercise2.ParcelManager;

public class SimpleParcelServerApp {
	
public static void main(String[] args) {
		
		ParcelManager parcelManager = new ParcelManager();
		
		System.out.println("Starting SimpleParcelServerApp");

		try {
			
			// Bind Serversocket to a port
			int portNo = 4228;
			ServerSocket serverSocket = new ServerSocket(portNo);
			
			// Server need to be alive forever
			while (true) {

				// Accept client request for connection
				Socket clientSocket = serverSocket.accept();
				
				// Read object from client, cast into Course
				ObjectInputStream ois = 
						new ObjectInputStream(clientSocket.getInputStream());
				Parcel parcel = (Parcel)ois.readObject();
				System.out.println("Processing object from client: " 
						+ parcel.getWeight() + parcel.getPrice());
				
				// Process object
				parcel = parcelManager.createParcel(parcel); 
				
				// Return object to client using input stream
				ObjectOutputStream oos =
						new ObjectOutputStream(clientSocket.getOutputStream());
				oos.writeObject(parcel);
				
				
				// Close all streams
				ois.close();
				oos.close();
				
				
			}

		} catch (Exception ex) {

			ex.printStackTrace();

		}
		
		
	}

}

