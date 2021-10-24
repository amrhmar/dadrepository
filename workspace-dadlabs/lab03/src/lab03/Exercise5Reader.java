package lab03;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Exercise5Reader {
	
	public static void main(String[] args) {

	
			String sourceFile = "Exercise5.txt";
			System.out.println("Reading data from " + sourceFile + "\n");

			try {

				BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));

				double Oct16 = 0;
				double Oct17 = 0;
				double Oct18 = 0;
				double Oct19 = 0;
				double Oct20 = 0;
				double Oct21 = 0;

				int totalUtilization = 0;
				int noOfRecords = 0;

				while(bis.available() > 0) {

					Oct16 = bis.read();
					Oct17 = bis.read();
					Oct18 = bis.read();
					Oct19 = bis.read();
					Oct20 = bis.read();
					Oct21 = bis.read();

					
					System.out.println( + Oct16 + "\t" + Oct17
							+ "\t" + Oct18 + "\t" + Oct19 + "\t" + Oct20
							+ "\t" + Oct21);

					// Calculate total utilization
					totalUtilization += Oct16 + Oct17 + Oct18 + Oct19
							+ Oct20 + Oct21;
					noOfRecords ++;
				}

				bis.close();

				double averageUtlization = totalUtilization / noOfRecords;
				System.out.print("\nAverage Daily Rainfall for" + " 6 stations: " + averageUtlization + "%");

			} catch (Exception ex) {

				ex.printStackTrace();
			}

			System.out.println("\nEnd of program.");

		}

	}