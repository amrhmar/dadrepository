package lab03;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Exercise4DataGenerator {

	public static void main(String[] args) {
		
		String outFile = "DailyRainfallDataDetails.txt";
		
		String StationID[] = {"2125002", "2324033", 
				"2322006", "2222002", 
				"2222033", "2222007"};
		
		String District[] = {"Jasin" + "\t", "Jasin"+ "\t", 
				"Alor Gajah", "Alor Gajah", 
				"Melaka Tengah", "Melaka Tengah"};
		
		String StationName[] = {"Telok Rimba", "Hospital Jasin", 
				"Melaka Pindah", "Durian Tunggal", 
				"Batu Hampar", "Cheng D/S"};
		
		double Oct16[] = {0.0, 0.0, 0.0, 9.0, 0.0, 3.0};
		double Oct17[] = {42.0, 4.0, 0.0, 3.0, 20.0, 6.0};
		
		double Oct18[] = {-9999.0, -9999.0, -9999.0, -9999.0, -9999.0, -9999.0};
		double Oct19[] = {-9999.0, -9999.0, -9999.0, -9999.0, -9999.0, -9999.0};
		
		double Oct20[] = {76.0, 48.0, 0.0, 94.0, 96.0, 145.0};
		double Oct21[] = {0.0, 0.0, 0.0, 1.0, 0.0, 0.0};
				

		
		try {
			
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(outFile));
			
			for (int index = 0; index < StationID.length; index++) {
				
				// 3. Write data into data stream
				dos.writeUTF(StationID[index]);
				dos.writeUTF(StationName[index]);
				dos.writeUTF(District[index]);
				dos.writeDouble(Oct16[index]);
				dos.writeDouble(Oct17[index]);
				dos.writeDouble(Oct18[index]);
				dos.writeDouble(Oct19[index]);
				dos.writeDouble(Oct20[index]);
				dos.writeDouble(Oct21[index]);

				
				// 4. Flush for each writing
				dos.flush();
			}
			
			// 5. Close stream
			dos.close();
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
		
		// Indicate end of program - Could be successful
		System.out.println("End of program. Check out " + outFile); 
	}

	
}