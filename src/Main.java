import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    double price;
    double salesTax = .05;

    System.out.println("Enter the price:");
    price = scan.nextDouble();

    double tax = price * salesTax;
    double total = tax + price;
    System.out.println("Your total after the tax is, " + total);

    }
}