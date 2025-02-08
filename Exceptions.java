import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Enter the number:- ");
            int number = scanner.nextInt();
            System.out.println(number);
        }catch (InputMismatchException e){
            System.out.println("Invalid input");
        }
        catch (ArithmeticException e){
            System.out.println("you cant divide by zero");
        }catch (Exception e){//for all type of exception but not prefer to use.
            System.out.println("Something went wrong");
        }finally {
            scanner.close();
            System.out.print("always execute");
        }
    }
}
