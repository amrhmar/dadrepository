package Exercise2;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

import Exercise2.Parcel;
import Exercise2.ParcelManager;

public class SimpleParcleClientApp {
	
public static void main(String args[]) {
		
		System.out.println("Launching SimpleParcelClientApp program");
		
		
		// Create new object
		Parcel parcel = new Parcel();
		parcel.setName1("Parcel Pricing");
		
		try {
			
			// Connect to server-side program
			Socket socket = new Socket(InetAddress.getLocalHost(), 4228);

			// Send object to be processed by the server-side application
			ObjectOutputStream oos = 
					new ObjectOutputStream (socket.getOutputStream());
			oos.writeObject(parcel);
			System.out.println("Sending " + parcel.getName1() + ":"  + " to server-side application");
			
			// Receive processed object
			ObjectInputStream ois =
					new ObjectInputStream(socket.getInputStream());
			Parcel processedParcel = (Parcel) ois.readObject();
			
			// Manipulate processed object
			System.out.println("Weight: " 
					+ processedParcel.getWeight());
			System.out.println("Price: RM " 
					+ processedParcel.getPrice());
			
			// Close alll streams
			ois.close();
			oos.close();
			socket.close();

		} catch (Exception ex) {

		}
		
		
	}

}
