package Week18;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;
public class lab2 {

    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy @ HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));


        String currentDirectory = System.getProperty("user.dir");
        System.out.println("Working directory is " + currentDirectory);
        String user_name = System.getProperty("user.name");
        System.out.println("Programmer " + user_name + "\n");

        // Code Starts
        int rooms = getRooms();
        double squareFeet = getSquareFeet(rooms);
        double pricePerGallon = getPricePerGallon();
        double total = getTotal(squareFeet, pricePerGallon);

        String result = "Total cost: $" + total;
        JOptionPane.showMessageDialog(null, result);
    }

    public static int getRooms() {
        String input = JOptionPane.showInputDialog("Enter the number of rooms:");
        return Integer.parseInt(input);
    }

    public static double getSquareFeet(int rooms) {
        double total = 0;
        for (int i = 1; i <= rooms; i++) {
            String input = JOptionPane.showInputDialog("Enter the square footage of room " + i + ":");
            total += Double.parseDouble(input);
        }
        return total;
    }

    public static double getPricePerGallon() {
        String input = JOptionPane.showInputDialog("Enter the price of the paint per gallon:");
        return Double.parseDouble(input);
    }

    public static double getTotal(double squareFeet, double pricePerGallon) {
        double paintCost = getPaintCost(squareFeet, pricePerGallon);
        double labor = getLabor(getHours(squareFeet));
        return paintCost + labor;
    }

    public static double getPaintCost(double squareFeet, double pricePerGallon) {
        return getGallons(squareFeet) * pricePerGallon;
    }

    public static double getGallons(double squareFeet) {
        return Math.ceil(squareFeet / 115);
    }

    public static double getHours(double squareFeet) {
        return Math.ceil(squareFeet / 115) * 8;
    }

    public static double getLabor(double hours) {
        return hours * 18;
    }
}