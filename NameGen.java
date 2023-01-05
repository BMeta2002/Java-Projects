import java.text.SimpleDateFormat;
import java.util.Date;

public class lab2 {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy @ HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));


        String currentDirectory = System.getProperty("user.dir");
        System.out.println("Working directory is " + currentDirectory);
        String user_name = System.getProperty("user.name");
        System.out.println("Programmer " + user_name);

        String first = "Bilal";
        String last = "Malik";
        char first_initial = first.charAt(0);
        char last_initial = last.charAt(0);

        System.out.println("Name: " + first + " " +  last);
        System.out.println("The initials of Bilal Malik are: " + first_initial + last_initial);
    }
}
