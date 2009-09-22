package warehousepackage;
import java.util.ArrayList;

/**
 * 
 */

/**
 * @author sam
 * @param addInventory adds quanitity and items to inventory if not alreadt there
 * @param getQauntity gets the current quantity of an item
 * @param getName gets the name of the item
 * @param removeInventory removes quantity from an item
 *
 */
public class WarehouseInventory {
	
	ArrayList<String[]> inventory = new ArrayList<String[]>(); // This part is magic
	
	public WarehouseInventory() {
		// Empty constructor or something for the Java Gods.
	}
	
	public void addInventory(String name, String id, String quantity) { // Add Items and Quantity to Invetory
		boolean exists = false;
		
		out:
		for (int i = 0; i < inventory.size(); i++) {
			String[] temp = inventory.get(i);
			
			if(temp[0] == id) {
				temp[2] = String.valueOf((Integer.parseInt(temp[2]) + // Dear Lord please forgive me
						Integer.parseInt(quantity))); // I hate Strings
				inventory.set(i, temp);
				exists = true;
				break out; // Come to papa optimization
			}
		}
		
		if(exists == false) { // Make a new one if it didn't already exist
			String[] cocksmoker = new String[3];
			
			cocksmoker[1] = name;
			cocksmoker[0] = id;
			cocksmoker[2] = quantity;
			
			inventory.add(cocksmoker);
		}
	}
	
	public int getQuantity(int id) { // Gets the quantity 
		inventory.trimToSize();
		
		for (int i = 0; i < inventory.size(); i++) {
			String[] temp = inventory.get(i);
			
			int tempint = Integer.parseInt(temp[0]);
			if(tempint == id) {
				return Integer.parseInt(temp[2]);
			}
		}
		
		return 0; // You should never see this 0, at least I hope not
	}

	public String getName(int id) { // Gets the name of the item
		inventory.trimToSize();
		
		for (int i = 0; i < inventory.size(); i++) {
			String[] temp = inventory.get(i);
			
			int tempint = Integer.parseInt(temp[0]);
			if(tempint == id) {
				return temp[1];
			}
		}
		
		return "Not Found"; // This should never print because in theory if it found a id
							// it should have a corresponding name ... maybe.
	}
	
	public void removeInventory(int id, int quantity) { // remove stuff from the quantity, ask me later why I
														// named it removeInventory
		inventory.trimToSize(); // HAHAH memory savings ... in JAVA!
		
		out:
		for (int i = 0; i < inventory.size(); i++) {
			String[] temp = inventory.get(i);
			
			if(Integer.parseInt(temp[0]) == id) {
				temp[2] = String.valueOf((Integer.parseInt(temp[2]) - quantity));
				inventory.set(i, temp);
				break out; // Look at all this code optimization!
			}
		}
	}
	
	public void printInventory() {
		for (int i = 0; i < inventory.size(); i++) {
			String[] temp = inventory.get(i);
			
			if(Integer.parseInt(temp[2]) >= 1) {
				System.out.println("For item: " + temp[1]);
				System.out.println("Quantity on hand is: " + temp[2]);
			}
		}
	}
	
	public void printBackOrders() {
		for (int i = 0; i < inventory.size(); i++) {
			String[] temp = inventory.get(i);
			
			if(Integer.parseInt(temp[2]) < 0) {
				System.out.println("For item: " + temp[1]);
				System.out.println("Quantity backordered is: " + temp[2]);
			}
		}
	}
}
