package Week19.EmployeeInfo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EmployeeDemo {

	public static void main(String[] args) {
		// Lab Header
	    String currentDirectory = System.getProperty("user.dir");
	    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy @ hh:mm a");
	    LocalDateTime now = LocalDateTime.now();
	    System.out.println("Working Directory " + currentDirectory);
	    System.out.println("Programmer: " + System.getProperty("user.name"));
	    System.out.println("Lab 19.1: " + dtf.format(now) + "\n");
	    
	    // Create the first employee 
	    // using the no-arg constructor
	    Employee empl1 = new Employee();
	    empl1.setName("Susan Meyers");
	    empl1.setIdNumber(47899);
	    empl1.setDepartment("Accounting");
	    empl1.setPosition("Vice President");
	    
	    // Create the second employee
	    // passing along arguments for all the fields
	    Employee empl2 = new Employee("Mark Jones", 39119,
	    		"IT", "Programmer");
	    
	    // Create the third employee
	    // uses the constructor that passes along name
	    // ID number
	    
	    Employee empl3 = new Employee("Joy Rogers", 81774);
	    empl3.setDepartment("Manufacturing");
	    empl3.setPosition("Engineer");
	    
	    // Display data for employee 1
	    System.out.println("Employee #1");
	    System.out.println("Name: " + empl1.getName());
	    System.out.println("ID Number: " + empl1.getIdNumber());
	    System.out.println("Department: " + empl1.getDepartment());
	    System.out.println("Position: " + empl1.getPosition() + "\n");
	    
	    // Display data for employee 2.
	    System.out.println("Employee #2");
	    System.out.println("Name: " + empl2.getName());
	    System.out.println("ID Number: " + empl2.getIdNumber());
	    System.out.println("Department: " + empl2.getDepartment());
	    System.out.println("Position: " + empl2.getPosition() + "\n");
	    
	    // Display data for employee 3.
	    System.out.println("Employee #3");
	    System.out.println("Name: " + empl3.getName());
	    System.out.println("ID Number: " + empl3.getIdNumber());
	    System.out.println("Department: " + empl3.getDepartment());
	    System.out.println("Position: " + empl3.getPosition() + "\n");
	    
	    
	}

}
