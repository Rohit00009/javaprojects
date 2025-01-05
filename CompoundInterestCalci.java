import java.util.Scanner;

public class CompoundInterestCalci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amount = 0;
        double principal = 0;
        double rate = 0;
        double timesCompounded = 0;
        double years = 0;

        System.out.println("Welcome to compound interest calculator!");

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the rate in %: ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the number of time compounded per year: ");
        timesCompounded = scanner.nextDouble();

        System.out.print("Enter the years: ");
        years = scanner.nextDouble();

        amount = principal * Math.pow((1 + rate / timesCompounded), timesCompounded * years);
        System.out.printf("The total amount is %.2f", amount);

        scanner.close();
    }
}

