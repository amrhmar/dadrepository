package lab03;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Exercise3DataGenerator {
	
	public static void main(String[] args) {
	
			String outFile = "DailyRainfallData.txt";
			
			String dates[] = {"16/10/2021", "17/10/2021", "18/10/2021", "19/10/2021", 
					"20/10/2021", "21/10/2021"};
			double utilizations[] = {3.0, 6.0, -9999.0, -9999.0, 145.0, 0.0};
			
			try {
				
				DataOutputStream dos = new DataOutputStream(new FileOutputStream(outFile));
				
				for (int index = 0; index < dates.length; index++) {
					
					dos.writeUTF(dates[index]);
					dos.writeDouble(utilizations[index]);
					
					dos.flush();
				}
				
				dos.close();
				
			} catch (Exception ex) {
				
				ex.printStackTrace();
			}
			
			System.out.println("End of program. Check out " + outFile); 
		}

	}
	

