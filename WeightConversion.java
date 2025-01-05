import java.util.Scanner;

public class WeightConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Welcome to weight conversion program!");
        System.out.println("1:- Convert lbs to kgs ");
        System.out.println("2:- Convert kgs to lbs ");

        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter the weight: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("Your weight in kgs is %.2f", newWeight);
        } else if (choice == 2) {
            System.out.print("Enter the weight: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("Your weight in lbs is %.2f", newWeight);
        } else {
            System.out.println("Invalid choice!");
        }

        scanner.close();

    }
}
