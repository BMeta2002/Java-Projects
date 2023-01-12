package Week19.CarStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CarDemo {

	public static void main(String[] args) {
		// Lab Header
	    String currentDirectory = System.getProperty("user.dir");
	    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy @ hh:mm a");
	    LocalDateTime now = LocalDateTime.now();
	    System.out.println("Working Directory " + currentDirectory);
	    System.out.println("Programmer: " + System.getProperty("user.name"));
	    System.out.println("Lab 19.2: " + dtf.format(now) + "\n");
	    
	    // Create car instance
	    Car car1 = new Car(2004, "Porsche");
	    
	    // Display car data
	    System.out.println("Current status of the car: ");
	    System.out.println("Year Model: " + car1.getYearModel());
	    System.out.println("Make: " + car1.getMake());
	    System.out.println("Speed: " + car1.getSpeed() + "\n");
	    
	    // Add 5 to the car speed 5 times
	    for(int i = 0; i < 5; i++) {
	    	car1.accelerate();
	    }
	    
	    // Display the cars new speed
	    System.out.println("Accelerating...");
	    System.out.println("Now the speed is " + car1.getSpeed() + "\n");
	    
	    // Subtract 5 to the car speed 5 times
	    for(int i = 0; i < 5; i++) {
	    	car1.brake();
	    }
	    
	    // Display the cars new speed
	    System.out.println("Braking...");
	    System.out.println("Now the speed is " + car1.getSpeed());
	}

}
