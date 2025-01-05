import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        int age ;
        boolean student;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        System.out.print("Are you a student? : ");
        student = scanner.nextBoolean();

        if(student == true){
            System.out.printf("hello %s , you are %d years old and a Student!\n" , name , age);
        }else{
            System.out.printf("hello %s , you are %d old but not a Student!\n" , name , age);
        }


        scanner.close();
    }
}
