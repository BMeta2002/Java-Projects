import java.text.SimpleDateFormat;
import java.util.Date;
public class lab1 {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy @ HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));


        String currentDirectory = System.getProperty("user.dir");
        System.out.println("Working directory is " + currentDirectory);
        String user_name = System.getProperty("user.name");
        System.out.println("Programmer " +  user_name);


        double percentage = 0.62;
        int sales_year = 4600000;
        double east_years = sales_year * percentage;
        System.out.printf("\nEast Coast Sales Prediction is: $%,.2f%n", east_years);
    }
}
