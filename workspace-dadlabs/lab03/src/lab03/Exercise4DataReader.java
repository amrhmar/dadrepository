package lab03;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class Exercise4DataReader {
	
	public static void main(String[] args) {

		String sourceFile = "DailyRainfallDataDetails.txt";
		System.out.println("Reading data from " + sourceFile + "\n");
		System.out.println("Daily Rainfall Data from Selected Station " + "\n");

		try {

			DataInputStream dis = new DataInputStream(new FileInputStream(sourceFile));

			double Oct16 = 0;
			double Oct17 = 0;
			double Oct18 = 0;
			double Oct19 = 0;
			double Oct20 = 0;
			double Oct21 = 0;
			
			double totalUtilization = 0;
			int noOfRecords = 0;
			
			String StationID = "";
			String District = "";
			String StationName = "";

			
			while(dis.available() > 0) {
				
				StationID = dis.readUTF();
				District = dis.readUTF();
				StationName = dis.readUTF();
				
				Oct16 = dis.readDouble();
				Oct17 = dis.readDouble();
				Oct18 = dis.readDouble();
				Oct19 = dis.readDouble();
				Oct20 = dis.readDouble();
				Oct21 = dis.readDouble();
				
				System.out.println( StationID + "\t" + District + "\t" + StationName + "\t"  + Oct16 + "\t" + Oct17
						+ "\t" + Oct18 + "\t" + Oct19 + "\t" + Oct20
						+ "\t" + Oct21);
				
				totalUtilization += Oct16 + Oct17 + Oct18 + Oct19
						+ Oct20 + Oct21;
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
