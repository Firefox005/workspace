package warehousepackage;
import java.util.Scanner;

/**
 * @author sam-klinger
 * @version 09/17/09
 * @param filetoRead
 *
 */
public class FileReader {
	
	public void readFile(String filetoRead) {
		
		WarehouseInventory thisWarehouse = new WarehouseInventory();
		
		// Very bad temp variables
		int temp1;
		int temp2;
		String temp3;
		int temp4;
		
		// Prompt user for a file, read it in. 
		// System.out.println("Enter a filepath to read.");
		Scanner in = new Scanner(System.in);
		
		// File inFile = new File(in.next());
		
		String inFile = filetoRead;
		
		// try catch block for IOExeptions
		try {
			in = new Scanner(inFile).useDelimiter(",");
			temp1 = Integer.parseInt(in.nextLine()); // "Unique ID for Invoice"
			while (in.hasNextLine()) { // WHY ISN'T THIS WORKING
				temp2 = in.nextInt(); // Grab next Int hopefully its the item_id
				temp3 = in.next(); // Grab what is supposed to be item_name
				temp4 = in.nextInt(); // Grab what I think is item_quantity
				
				String string1 = Integer.toString(temp2);
				String string2 = Integer.toString(temp4);
				
				thisWarehouse.addInventory(string1, temp3, string2);
			}
		}
		
		finally {
			in.close(); // By Grabthar's Hammer you will close this file 
						// (@see Galaxy Quest)
		}
		
	}
	

}
