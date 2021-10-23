package lab03;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Exercise5Reader {
	
	public static void main(String[] args) {

	
	// 1. Declare output file 
			String sourceFile = "Exercise5.txt";
			System.out.println("Reading data from " + sourceFile + "\n");

			try {

				// 2. Create stream to read data
				BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));

				// Variables for processing byte-based data
				double Oct16 = 0;
				double Oct17 = 0;
				double Oct18 = 0;
				double Oct19 = 0;
				double Oct20 = 0;
				double Oct21 = 0;

				double totalUtilization = 0;
				int noOfRecords = 0;

				// 3. Process data until end-of-file
				while(bis.available() > 0) {

					// Read data
					Oct16 = bis.read();
					Oct17 = bis.read();
					Oct18 = bis.read();
					Oct19 = bis.read();
					Oct20 = bis.read();
					Oct21 = bis.read();

					
					System.out.println("\t"  + Oct16 + "\t" + Oct17
							+ "\t" + Oct18 + "\t" + Oct19 + "\t" + Oct20
							+ "\t" + Oct21);

					// Calculate total utilization
					totalUtilization += Oct16 + Oct17 + Oct18 + Oct19
							+ Oct20 + Oct21;
					noOfRecords ++;
				}

				// 4. Close stream
				bis.close();

				// Calculate average utilization
				double averageUtlization = totalUtilization / noOfRecords;
				System.out.print("\nAverage Daily Rainfall for" + " 6 stations: " + averageUtlization + "%");

			} catch (Exception ex) {

				ex.printStackTrace();
			}

			// Indicate end of program - Could be successful
			System.out.println("\nEnd of program.");

		}

	}