/**
 * Created by Don Stefan on 01/02/2017.
 */
import java.util.Scanner;
public class Main {
    private static Scanner scanner = new Scanner ( System.in );
    private String input;

    public static void main ( String[] args ) {
        System.out.println("Please input your first name:");
        String firstName = scanner.next();

        System.out.println("Please input your last name:");
        String lastName = scanner.next();

        System.out.println("What is your age " + firstName + " " + lastName + "?");
        int age = scanner.nextInt();

        System.out.println("Do you have any special qualifications?");
        String qualifications = scanner.next();

        System.out.println("Please tell us of any special skills you have:");
        String specialSkills = scanner.next();

        System.out.println("What was your undergraduate GPA?");
        float gpa = scanner.nextFloat();

        System.out.println("Any comments about your preferred job?");
        String comments = scanner.next();

        System.out.println("How much do you expect to get paid?");
        int salary = scanner.nextInt();

        System.out.println("How many previous jobs did you have?");
        String jobs = scanner.next();

        System.out.println("First Name:         " + firstName);
        System.out.println("Last Name:          " + lastName);
        System.out.println("Age:                " + age);
        System.out.println("Qualifications:     " + qualifications);
        System.out.println("Special Skills:     " + specialSkills);
        System.out.println("Undergraduate GPA:  " + gpa);
        System.out.println("General Comments:   " + comments);
        System.out.println("Salary Expectation: Ksh " + salary);
        System.out.println("Previous Jobs:      " + jobs);

        if (gpa >= 3.0)
            System.out.println("You've got the job " + firstName + " " + lastName);
        else
            System.out.println("We are sorry we cannot hire you");

    }
}