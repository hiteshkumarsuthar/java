// Pattern-1
// public class Main {
//     public static void main(String[] args) {

//         int n = 4;

//         for(int row = 1; row <= n; row++) {
//             //for each row -> n columns
//             for(int col = 1; col <= n; col++) {
//                 //print star
//                 System.out.print("* ");
//             }
//             //Move to next line or row
//             System.out.println();
//         }
//     }
// }


// Pattern-2
// public class Main {
//     public static void main(String[] args) {

//         int n = 3;
//         for(int row = 1; row <= n; row++) {
//             for(int col = 1; col <= 5; col++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }


// Pattern-4
// public class Main {
//     public static void main(String[] args) {

//         int n = 5;
//         for(int row = 1; row <= n; row++) {
//             for(int col = 1; col <= row; col++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }


// Pattern-5
public class Main {
    public static void main(String[] args) {

        int n = 5;
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }
            for(int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();   
        }
    }
}