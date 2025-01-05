import java.util.Scanner;

public class MadLibGame {
    public static void main(String[] args) {
        String adj1;
        String noun;
        String adj2;
        String verb;
        String noun2;

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter adj1:- ");
        adj1 = scanner.nextLine();
        System.out.print("enter noun:- ");
        noun = scanner.nextLine();
        System.out.print("enter adj2:- ");
        adj2 = scanner.nextLine();
        System.out.print("enter verb:- ");
        verb = scanner.nextLine();
        System.out.print("enter noun2:- ");
        noun2 = scanner.nextLine();

        System.out.println("I was very " + adj1 + " when i was in first year.");
        System.out.println("Everything was gone good until i met " + noun + ".");
        System.out.println("After we met the everything was " + adj2 + " " + verb + " and rohit becomes " + noun2);

        scanner.close();
    }
}