package Week15;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class lab3 {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy @ HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));


        String currentDirectory = System.getProperty("user.dir");
        System.out.println("Working directory is " + currentDirectory);
        String user_name = System.getProperty("user.name");
        System.out.println("Programmer " + user_name);

        // CODE STARTS
        double tax_rate = 6.75/100;
        double tip_rate = .20;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String username = input.nextLine();

        System.out.print("Enter the charge for the meal: ");
        double meal_price = input.nextDouble();

        double tax = tax_rate * meal_price;
        double tip = (tax + meal_price) * tip_rate;
        double total = tax + tip + meal_price;


        System.out.print(username + ", here is the receipt: ");

        System.out.printf("\nMeal Charge: $%,-10.2f", meal_price );
        System.out.printf("\nTax:         $%,-10.2f", tax );
        System.out.printf("\nTip:         $%,-10.2f", tip );
        System.out.printf("\nTotal:       $%,-10.2f", total );


    }
}