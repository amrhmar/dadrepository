package lab03;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Exercise5Writer {
	
public static void main(String[] args) {
		
	// 1. Declare output file 
			String outFile = "Exercise5.txt";

			// Data declaration			
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

				// 2. Create stream to read data
				BufferedOutputStream bos = new BufferedOutputStream (new FileOutputStream(outFile));

				// 3. Write data into buffer
				for (int index = 0; index < StationID.length; index++) {
					
					byte utlization1 = (byte) Oct16[index];
					byte utlization2 = (byte) Oct17[index];
					byte utlization3 = (byte) Oct18[index];
					byte utlization4 = (byte) Oct19[index];
					byte utlization5 = (byte) Oct20[index];
					byte utlization6 = (byte) Oct21[index];

					bos.write(utlization1);
					bos.write(utlization2);
					bos.write(utlization3);
					bos.write(utlization4);
					bos.write(utlization5);
					bos.write(utlization6);

					// 4. Flush for each writing
					bos.flush();
				}

				// 5. Close stream
				bos.close();

			} catch (Exception ex) {

				ex.printStackTrace();
			}

			// Indicate end of program - Could be successful
			System.out.println("End of program. Check out " + outFile); 

		}

	}