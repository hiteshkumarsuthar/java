// Conditional statement
// if-Statemnt
public class Main {
    public static void main(String[] args) {
        int number = 12;

        if (number >= 10) {
            System.out.println("Good Consistency!");
        }
    }
}


// if-else Statement
public class Main {
    public static void main(String[] args) {

        int score = 89;

        if (score >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}


// if-else-if statement
public class Main {
    public static void main(String[] args) {

        int accuracy = 98;

        if (accuracy >= 90) {
            System.out.println("Excellent");
        }
        else if (accuracy >= 75) {
            System.out.println("Good");
        }
        else if (accuracy >= 60) {
            System.out.println("Average");
        }
        else {
            System.out.println("Need improvment");
        }
    }
}


// Nested statement
public class Main {
    public static void main(String[] args) {

        int age = 20;
        char gender = 'M';

        if (gender == 'M') {
            System.out.println("You are a male");
            if (age > 18) {
                System.out.println("You are male and age > 18");
            }
            else {
                System.out.println("You are male and age <= 18");
            } 
        }
        else {
            System.out.println("You are not a male");
        }
    }
}


// Ternary operator
public class Main {
    public static void main(String[] args) {
        
        int streakdays = 35;

        String status = (streakdays >= 30) ? "Consistent" : "Irregular";

        System.out.println(status);
    }
}


// Switch statement
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the value for day");
        Scanner sc = new Scanner(System.in);
        int dayNumber = sc.nextInt();

        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            
            case 2:
                System.out.println("Tuesday");
                break;
            
            case 3:
                System.out.println("Wednesday");
                break;

            default:
                System.out.println("Invalid day");
        }
    }
}


