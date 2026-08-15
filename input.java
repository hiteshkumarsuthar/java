// Java Input/Output System

import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int firstNum = sc.nextInt();
        System.out.println("Enter the second number : ");
        int secondNum = sc.nextInt();
        int total = firstNum + secondNum;
        System.out.println("Total is : " + total);




        BigInteger bg = sc.nextBigInteger();
        System.out.println("BigInteger : " + bg);

        System.out.println("Enter the value for flag : ");
        boolean flag = sc.nextBoolean();
        System.out.println("Enter the value for shortVal : ");
        short shortVal = sc.nextShort();
        System.out.println("Enter the valur for floatvalue : ");
        float floatValue = sc.nextFloat();

    
        System.out.println("Flag is : " + flag);
        System.out.println("ShortVal is : " + shortVal);
        System.out.println("floatValue is : " + floatValue);
        
        sc.close();
    }
}