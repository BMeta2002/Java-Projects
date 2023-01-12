package Week19.CircleInfo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CarDemo {

	public static void main(String[] args) {
		// Lab Header
	    String currentDirectory = System.getProperty("user.dir");
	    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy @ hh:mm a");
	    LocalDateTime now = LocalDateTime.now();
	    System.out.println("Working Directory " + currentDirectory);
	    System.out.println("Programmer: " + System.getProperty("user.name"));
	    System.out.println("Lab 19.4: " + dtf.format(now) + "\n");

	    double radius;

	    Scanner kb = new Scanner (System.in);

	    System.out.print("Enter the radius of a circle: ");
	    radius = kb.nextDouble();

	    kb.close();

	    Circle circle = new Circle(radius);

	    System.out.printf("The circle's area is %.2f%n"
	    		+ "The circle's diameter is %.2f%n"
	    		+ "The circle's circumference is %.2f%n", 
	    		circle.getArea(), circle.getDiameter(), circle.getCircumference());
	    
	    
	}

}
