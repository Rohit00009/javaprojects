import java.util.Scanner;
public class ShoppingCart {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String item;
        String currency;
        double price;
        double quantity;
        double total;

        System.out.print("Enter the item that you want tot buy: ");
        item = scanner.nextLine();

        System.out.print("Enter your currency: ");
        currency = scanner.nextLine();

        System.out.print("Enter the price of item: ");
        price = scanner.nextDouble();

        System.out.print("Enter the quantity of item: ");
        quantity = scanner.nextDouble();


        System.out.println("You bought " + quantity + " " + item + "'s");

        total = price * quantity;

        System.out.println("The total amount to pay: " + currency+ " " + total);

        scanner.close();
    }
}
