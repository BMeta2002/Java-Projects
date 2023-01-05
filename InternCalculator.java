package Week18;

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
        System.out.println("Programmer " + user_name+ "\n");

        // Code Starts
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String username = input.nextLine();

        System.out.print("What is your class grade? ");
        int Grade = input.nextInt();

        System.out.print("what is your contract points");
        int contractPoints = input.nextInt();

        if (Grade >= 70 && contractPoints >= 350) {
            qualify(username);
        }
        else {
            noQualify(username);
        }

    }

    public static void qualify(String username) {
        System.out.println(username + ", Congratulations!, you qualify for an Internship");
    }

    public static void noQualify(String username) {
        System.out.println(username + ", you do not qualify for an Internship");
    }


}
