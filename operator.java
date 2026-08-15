// Operator
// Arthematic operator

// public class Main {
//     public static void main(String[] args) {

//         int num1 = 25;
//         int num2 = 15;

//         int total = num1 + num2;
//         int substraction = num1 - num2;
//         int multiply = num1 * num2;
//         int division = num1 / num2;
//         int remainder = num1 % num2;

//         System.out.println(total);
//         System.out.println(substraction);
//         System.out.println(multiply);
//         System.out.println(division);
//         System.out.println(remainder);

//     }
// }


// Relational operator
// public class Main {
//     public static void main(String[] args) {
//         int num1 = 45;
//         int num2 = 50;


//         System.out.println(num1 == num2);
//         System.out.println(num1 != num2);
//         System.out.println(num1 > num2);
//         System.out.println(num1 < num2);
//         System.out.println(num1 >= num2);
//         System.out.println(num1 <= num2);
//     }
// }


// logical operator

// public class Main {
//     public static void main(String[] args) {
//         int ratingPoint = 100;

//         ratingPoint += 20;
//         System.out.println(ratingPoint);

//         ratingPoint -= 10;
//         System.out.println(ratingPoint);

//         ratingPoint *= 2;
//         System.out.println(ratingPoint);
        
//         ratingPoint /= 4;
//         System.out.println(ratingPoint);

//         ratingPoint %= 30;
//         System.out.println(ratingPoint);
        

//     }
// }

public class Main {
    public static void main(String[] args) {

        int activeUser = 100;

        int preFix = ++activeUser;
        int postFix = activeUser++;

        System.out.println(preFix);
        System.out.println(postFix);
        System.out.println(activeUser);
    }
}