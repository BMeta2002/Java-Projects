package Week19.RetailItem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RetailItemDemo {

	public static void main(String[] args) {
		// Lab Header
	    String currentDirectory = System.getProperty("user.dir");
	    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy @ hh:mm a");
	    LocalDateTime now = LocalDateTime.now();
	    System.out.println("Working Directory " + currentDirectory);
	    System.out.println("Programmer: " + System.getProperty("user.name"));
	    System.out.println("Lab 19.3: " + dtf.format(now) + "\n");
	    
	    // Create instance of the retail item
	    RetailItem item1 = new RetailItem("Jacket", 12, 59.95);
	    RetailItem item2 = new RetailItem("Designer Jeans", 40, 34.95);
	    RetailItem item3 = new RetailItem("Shirt", 20, 24.95);
	    
	    // Display retail items data
	    System.out.println("Item #1");
	    System.out.println(item1);
	    System.out.println("Item #2");
	    System.out.println(item2);
	    System.out.println("Item #3");
	    System.out.println(item3);
	}

}
