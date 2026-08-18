// print count 1 to n
// public class Main {
//     public static void main(String[] args) {
//         int i = n;
//         for(int i = 1; i < n; i++) {
//             System.out.println(i);
//         }
//     }
// }



// print counting n to 1
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {

//         System.out.println("Enter number of n ");

//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int i = n; i >= 1; i--) {
//             System.out.println(i);
//         }
//     }
// }



// print the 10 multiples of n
// import java.util.Scanner;

// public class loop_que {
//     public static void main(String[] args) {

//         System.out.println("Enter the number : ");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int i = 10; i <= n; i+=10) {
//             System.out.println(i);
//         }
//     }
// }



// print name 100 times
// public class Main {
//     public static void main(String[] args) {

//         for(int i = 1; i <= 100; i++) {
//             System.out.println("Hitesh Kumar suthar");
//         }
//     }
// }


// print 1 to 100 even number
// public class Main {
//     public static void main(String[] args) {
//         for(int i = 1; i <= 100; i++) {
//             if(i % 2 == 0) {
//                 System.out.println(i);
//             }
//         }
//     }
// }


// print sum number
// public class Main {
//     public static void main(String[] args) {
//         int[] num = {1, 2, 3, 4, 5};
//         int sum = 0;
//         for(int i = 0; i < num.length; i++) {
//             sum = sum + num[i];
//         }
//         System.out.println(sum);
//     }
// }


// print 50 to 100 range number divsible by 7
// public class Main {
//     public static void main(String[] args) {
//         for(int i = 50; i <= 100; i++) {
//             if(i % 7 == 0) {
//                     System.out.println(i);
//             }
//         }
//     }
// } 



public class Main {
    public static void main(String[] args) {
        int n = 20;
        boolean prime = true;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                prime = false;
                break;
            }
        }
        System.out.println("Prime number (true/false) : " + prime);
    }
}