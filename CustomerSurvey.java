import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.text.DecimalFormat;

public class lab4 {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy @ HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));


        String currentDirectory = System.getProperty("user.dir");
        System.out.println("Working directory is " + currentDirectory);
        String user_name = System.getProperty("user.name");
        System.out.println("Programmer " + user_name);

        final int Customer = 12467;
        final double MoreOneDrink = .14;
        final double EnergyDrinks = .64;

        double yearly = Customer * MoreOneDrink;
        double CitrusEnergyDrinks = yearly * EnergyDrinks;

        DecimalFormat form = new DecimalFormat("##,###");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Username: ");
        String username = input.nextLine();

        System.out.println(username + " " + "here is the result: \n");


        System.out.println("The company surveyed " + form.format(Customer) + " people.");
        System.out.println("Approximately " + form.format(yearly) + " purchase at least one energy drink per year.");
        System.out.println("Approximately " + form.format(CitrusEnergyDrinks) + " prefer citrus flavored energy drinks.");
    }
}