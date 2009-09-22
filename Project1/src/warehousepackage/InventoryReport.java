package warehousepackage;

import java.util.ArrayList;

/**
 * Prints a sweet looking chart of all the items that are currently in inventory. See BackOrderReport for
 * getting a sweet print out of the backorder items. This whole file is useless
 * 
 * @author sam-klinger
 * @params none
 * @see BackOrderReport
 * @deprecated
 *
 */
public class InventoryReport {
	
	// For every element in the warehouse get its name, id, and quantity, unless its backorderd
	
	public void printInventoryReport (ArrayList<String> inventory) {
		System.out.println("---------------------------------"); 
		System.out.println("---------------------------------");
		// lets make the print area 33 spaces aross because 9! aught to be
		// enough space for id numbers, names, and quanitity
		// lets face it if you have 362,880 of anything you have too much
	}

}
