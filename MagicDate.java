package Week16;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy @ HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));


        String currentDirectory = System.getProperty("user.dir");
        System.out.println("Working directory is " + currentDirectory);
        String user_name = System.getProperty("user.name");
        System.out.println("Programmer " + user_name + "\n");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String username = input.nextLine();

        System.out.print("Enter the number for a month: ");
        int Month = input.nextInt();

        System.out.print("Enter the number for a day: ");
        int Day = input.nextInt();

        System.out.print("Enter a two digit year: ");
        int Year = input.nextInt();

        if (Year == Month * Day) {
            System.out.println(username + ", That date is magic!");
        }
        else {
            System.out.println(username + ", sorry that's just a regular date... not magic.");

        }
    }
}