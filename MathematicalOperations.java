import java.util.Scanner;

public class MathematicalOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radius;
        double area = 0;
        double circumference = 0;
        double volume = 0;


        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        area = Math.PI * Math.pow(radius, 2);
        circumference = 2 * Math.PI * radius;
        volume = (4/3) * Math.PI * Math.pow(radius, 3);

        System.out.printf("The area is %.2f\n" , area , "sqcm");
        System.out.printf("The circumference is %.2f\n" , circumference );
        System.out.printf("The volume is %.2f\n" , volume);




        scanner.close();
    }
}
