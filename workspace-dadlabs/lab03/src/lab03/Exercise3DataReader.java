package lab03;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class Exercise3DataReader {

	public static void main(String[] args) {

		String sourceFile = "DailyRainfallData.txt";
		System.out.println("Reading data from " + sourceFile + "\n");
		System.out.println("Daily Rainfall Data from Station Cheng (Taman Merdeka) in Melaka Tengah district " + "\n");

		try {

			DataInputStream dis = new DataInputStream(new FileInputStream(sourceFile));

			double utlization = 0;
			double totalUtilization = 0;
			int noOfRecords = 0;
			String state = "";
			
			while(dis.available() > 0) {
				
				state = dis.readUTF();
				utlization = dis.readDouble();
				System.out.println( state + "\t" + utlization);
				
				totalUtilization += utlization;
				noOfRecords ++;
			}
			
			dis.close();
			
			double averageUtlization = totalUtilization / noOfRecords;
			String formattedAverage = String.format("%.1f", averageUtlization);
			System.out.print("\nAverage of the rainfall for " + noOfRecords 
					+ " days: " + formattedAverage + "%");
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}

		System.out.println("\nEnd of program.");
		

	}

}