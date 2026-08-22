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
// public class Main {
//     public static void main(String[] args) {

//         int n = 5;
//         for(int row = 1; row <= n; row++) {
//             for(int col = 1; col <= n - row; col++) {
//                 System.out.print("  ");
//             }
//             for(int col = 1; col <= n; col++) {
//                 System.out.print("* ");
//             }
//             System.out.println();   
//         }
//     }
// }


// Pattern-6
// public class Main {
//     public static void main(String[] args) {
//         int n = 5;
//         for(int row = 1; row <= n; row++) {
//             for(int col = 1; col <= n - row + 1; col++) {
//                 System.out.print("*  ");
//             }
//             System.out.println();
//         }
//     }
// }


// Pattren-7
// public class Main {
//     public static void main(String[] args) {
//         int n = 5;
//         for(int row = 1; row <= n; row++) {
//             for(int col = 1; col <= n - row; col++) {
//                 System.out.print("  ");
//             }
//             for(int col = 1; col <= 2 * row - 1; col++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }


// Pattern-8
// public class Main {
//     public static void main(String[] args) {
//         int n = 5;
//         for(int row = 1; row <= n; row++) {
//             for(int col = 1; col <= row - 1; col++) {
//                 System.out.print("  ");
//             }
//             for(int col = 1; col <= n * 2 - (row * 2 - 1); col++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }


// Pattern-9
// public class Main {
//     public static void main(String[] args) {

//         int n = 4;
//         for(int row = 1; row <= n; row++) {
//             for(int col = 1; col <= 6; col++) {
//                 if(row == 1 || row == n) {
//                     System.out.print("* ");
//                 }
//                 else {
//                     if(col == 1 || col == 6) {
//                         System.out.print("* ");
//                     }
//                     else {
//                         System.out.print("  ");
//                     }
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


// Pattern-10
// public class Main {
//     public static void main(String[] args) {

//         int n = 10;
//         for(int row = 1; row <= n; row++) {
//             if(row == 1 || row == 2 || row == n) {
//                 for(int col = 1; col <= row; col++) {
//                     System.out.print("* ");
//                 }
//             }
//             else {
//                 System.out.print("* ");

//                 for(int col = 1; col <= (row - 2); col++) {
//                     System.out.print("  ");
//                 }
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }


// Pattern-11
// public class Main {
//     public static void main(String[] args) {

//         int n = 5;
//         for(int row = 1; row <= n; row++) {
//             for(int col = 1; col <= n - row; col++) {
//                 System.out.print("  ");
//             }
//             if(row == 1 || row == n) {
//                 for(int col = 1; col <= 2 * row - 1; col++) {
//                     System.out.print("* ");
//                 }
//             }
//             else {
//                 System.out.print("* ");

//                 for(int col = 1; col <= 2 * row - 3; col++) {
//                     System.out.print("  ");
//                 }
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }


// Pattern-12
// public class Main {
//     public static void main(String[] args) {
//         //Part-1
//         int n = 4;
//         for(int row = 1; row <= n; row++) {
//             for(int col = 1; col <= n - row; col++) {
//                 System.out.print("  ");
//             }
//             for(int col = 1; col <= 2 * row - 1; col++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         //Part-2
//         for(int row = 1; row <= n; row++) {
//             if(row == 1) {
//                 continue;
//             }
//             for(int col = 1; col <= row - 1; col++) {
//                 System.out.print("  ");
//             }
//             for(int col = 1; col <= 2 * n - 2 * row + 1; col++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }


// Pattern-13
public class Main {
    public static void main(String[] args) {

    }
}