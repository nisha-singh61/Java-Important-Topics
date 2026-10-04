import java.util.Scanner;

public class Scanners {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String name = scanner.nextLine();

    System.out.print("Enter your name2: ");
    String name2 = scanner.next();

    System.out.print("Enter your age: ");
    Integer age = scanner.nextInt();

    System.out.print("What is your GPA: ");
    double gpa = scanner.nextDouble();

    System.out.print("Are you a Student? (true/false): ");
    boolean isStudent =  scanner.nextBoolean();

    System.out.println("Hello " + name);
    System.out.println("Good Bye! " + name2);
    System.out.println("You are " + age + " years old...");
    System.out.println("Your gpa is: " + gpa);
    if(isStudent){
        System.out.println("You are Enrolled as a Student");
    }else{
        System.out.println("You are Not Enrolled");
    }


    scanner.close();
}
}
