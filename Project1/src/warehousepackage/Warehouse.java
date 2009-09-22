package warehousepackage;
import java.util.*;

/**
 * @author sam
 *
 */
public class Warehouse { // Insert unwitty comment about horrible code /here/

	/**
	 * @param none
	 */
	public static void main(String[] args) {
		
		WarehouseInventory thisWarehouse = new WarehouseInventory(); // Shields up code incomming
		// BackOrderReport thisbackOrder = new BackOrderReport(); 
		// InventoryReport thisInvetory = new InventoryReport();
		FileReader thisfileReader = new FileReader();
		
		
		Scanner in = new Scanner(System.in);
		
		int menuChoice = 0;
		
		printMenu();
		
		menuChoice = in.nextInt();

		
		if (menuChoice == 1) {
			System.out.println("Please enter the file to read.");
			String filetoRead = in.next();
			thisfileReader.readFile(filetoRead);
		}
		else if (menuChoice == 2) {
			System.out.println("What is the item number you wish to file?");
			String name = null;
			String quantity = null;
			String id = in.next();
			thisWarehouse.addInventory(name, id, quantity);
		}
		else if (menuChoice == 3) {
			thisWarehouse.printInventory();
		}
		else if (menuChoice == 4) {
			thisWarehouse.printBackOrders();
		}
		else if (menuChoice == 5) {
			System.out.println("Goodbye");
			System.exit(1);
		}
		else if (menuChoice > 5) {
			System.out.println("Please enter a number 1-5.");
			printMenu();
		}
	}
	
	public static void printMenu() {
		System.out.println("Please select the number of your choice: ");
		System.out.println("1. Add a new Shipment Invoice");
		System.out.println("2. File an Order");
		System.out.println("3. Print a warehouse inventory report");
		System.out.println("4. Print a Backorder Report");
		System.out.println("5. Exit");
	}

}
