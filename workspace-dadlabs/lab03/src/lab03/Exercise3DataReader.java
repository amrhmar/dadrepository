package lab03;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class Exercise3DataReader {

	public static void main(String[] args) {

		// 1. Declare output file 
		String sourceFile = "DailyRainfallData.txt";
		System.out.println("Reading data from " + sourceFile + "\n");
		System.out.println("Daily Rainfall Data from Station Cheng (Taman Merdeka) in Melaka Tengah district " + "\n");

		try {

			// 2. Create stream to read data
			DataInputStream dis = new DataInputStream(new FileInputStream(sourceFile));

			// Variables for processing byte-based data
			double utlization = 0;
			double totalUtilization = 0;
			int noOfRecords = 0;
			String state = "";
			
			// 3. Process data until end-of-file
			while(dis.available() > 0) {
				
				// Read data
				state = dis.readUTF();
				utlization = dis.readDouble();
				System.out.println( state + "\t" + utlization);
				
				// Calculate total utilization
				totalUtilization += utlization;
				noOfRecords ++;
			}
			
			// 4. Close stream
			dis.close();
			
			// Calculate average utilization
			double averageUtlization = totalUtilization / noOfRecords;
			String formattedAverage = String.format("%.1f", averageUtlization);
			System.out.print("\nAverage of the rainfall for " + noOfRecords 
					+ " days: " + formattedAverage + "%");
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}

		// Indicate end of program - Could be successful
		System.out.println("\nEnd of program.");
		

	}

}