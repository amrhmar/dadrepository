package lab03;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Exercise3DataGenerator {
	
	public static void main(String[] args) {
	
	// 1. Declare output file 
			String outFile = "DailyRainfallData.txt";
			
			// Data declaration
			String states[] = {"16/10/2021", "17/10/2021", "18/10/2021", "19/10/2021", 
					"20/10/2021", "21/10/2021"};
			double utilizations[] = {3.0, 6.0, -9999.0, -9999.0, 145.0, 0.0};
			
			try {
				
				// 2. Create stream to read data
				DataOutputStream dos = new DataOutputStream(new FileOutputStream(outFile));
				
				// Process data
				for (int index = 0; index < states.length; index++) {
					
					// 3. Write data into data stream
					dos.writeUTF(states[index]);
					dos.writeDouble(utilizations[index]);
					
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
	

