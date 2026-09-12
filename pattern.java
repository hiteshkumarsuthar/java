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


// Pattern-3
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


// Pattern-4
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


// Pattern-5
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


// Pattren-6
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


// Pattern-7
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


// Pattern-8
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


// Pattern-9
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


// Pattern-10
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


// Pattern-11
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


// Pattern-12
// public class Main {
//     public static void main(String[] args) {

//         //Part-1
//         int n = 4;

//         for(int row = 1; row <= n; row++) {

//             for(int col = 1; col <= n - row; col++) {
//                 System.out.print("  ");
//             }

//             if(row == 1) {
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

//         //Part-2
//         for(int row = 1; row <= (n-1); row++) {
            
//             for(int col = 1; col <= row; col++) {
//                 System.out.print("  ");
//             }

//             if(row == (n - 1)) {
//                 System.out.print("* ");
//             }
//             else {
//                 System.out.print("* ");

//                 for(int col = 1; col <= 2 * (n - row) - 3; col++) {
//                     System.out.print("  ");
//                 }
//                 System.out.print("* ");
//             }

//             System.out.println();
//         }
//     }
// }


// Pattern-13
// public class Main {
//     public static void main(String[] args) {
//         // Part-1
//         int n = 4;

//         for(int row = 1; row <= n; row++) {

//             for(int col = 1; col <= row; col++) {
//                 System.out.print("* ");
//             }

//             for(int col = 1; col <= 2*(n - row); col++) {
//                 System.out.print("  ");
//             }

//             for(int col = 1; col <= row; col++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }

//         // Part-2
//         for(int row = 1; row <= n; row++) {

//             for(int col = 1; col <= n - row + 1; col++) {
//                 System.out.print("* ");
//             }

//             for(int col = 1; col <= 2*(row - 1); col++) {
//                 System.out.print("  ");
//             }

//             for(int col = 1; col <= n - row + 1; col++) {
//                 System.out.print("* ");
//             }

//             System.out.println();
//         }
//     }
// }


// Numerical Pattern
// Pattern-14
// public class Main {
//     public static void main(String[] args) {
        
//         int n = 5;

//         for(int row = 1; row <= n; row++) {

//             for(int col = 1; col <= row; col++) {
//                 System.out.print(col+" ");
//             }

//             System.out.println();
//         }
//     }
// }


// Pattern-15
// public class Main {
//     public static void main(String[] args) {

//         int n = 5;
//         int count = 1;

//         for(int row = 1; row <= n; row++) {

//             for(int col = 1; col <= row; col++) {
//                 System.out.print(count + " ");
//                 count++;
//             }

//             System.out.println();
//         }
//     }
// }

//Practice-code
// public class Main {
//     public static void main(String[] args) {

//         int n = 5;
//         int count = 1;

//         for(int row = 1; row <= n; row++) {

//             for(int col = 1; col <= n - row + 1; col++) {
//                 System.out.print(count + " ");
//                 count++;
//             }

//             System.out.println();
//         }
//     }
// }


// Pattern-16
// public class Main {
//     public static void main(String[] args) {

//         int n = 5;

//         for(int row = 1; row <= n; row++) {
            
//             for(int col = 1; col <= row; col++) {
//                 System.out.print((char)('A' + col - 1) + " ");
//             }

//             System.out.println();
//         }
//     }
// }


// Pattern-17
// public class Main {
//     public static void main(String[] args) {

//         int n = 5;

//         for(int row = 1; row <= n; row++) {

//             for(int col = 1; col <= n - row + 1; col++) {
//                 System.out.print((char)('A' + col - 1) + " ");
//             }

//             System.out.println();
//         }
//     }
// }


// Pattern-18
// public class Main {
//     public static void main(String[] args) {

//         int n = 5;

//         for(int row = 1; row <= n; row++) {

//             for(int col = 1; col <= row; col++) {
//                 System.out.print((char)(n - col + 'A') + " ");
//             }

//             System.out.println();
//         }
//     }
// }


// Pattern-19
// public class Main {
//     public static void main(String[] args) {

//         int n = 5;

//         for(int row = 1; row <= n; row++) {

//             for(int col = 1; col <= row - 1; col++) {
//                 System.out.print("  ");
//             }

//             for(int col = 1; col <= 2 * n - 2 * row + 1; col++) {
//                 System.out.print("* ");
//             }

//             System.out.println();
//         }

//         for(int row = 2; row <= n; row++) {

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


// Pattern-20
// public class Main {
//     public static void main(String[] args) {

//         int n = 4;

//         for(int row = 1; row <= n; row++) {

//             for(int col = 1; col <= n - row; col++) {
//                 System.out.print("   ");
//             }

//             for(int col = 1; col <= row; col++) {
//                 System.out.print(col + "  ");
//             }

//             int rowValue = row;
//             int decRowValue = row -1;

//             for(int col = 1; col <= row - 1; col++) {
//                 System.out.print(decRowValue + "  ");
//                 decRowValue--;
//             }

//             System.out.println();
//         }
//     }
// }


// Pattern-21
// public class Main {
//     public static void main(String[] args) {
        
//         int n = 4;

//         for(int row = 1; row <= n; row++) {

//             for(int col = 1; col <= n - row; col++) {
//                 System.out.print("  ");
//             }

//             for(int col = 1; col <= 2 * row - 1; col++) {
//                 System.out.print(row + " ");
//             }

//             System.out.println();
//         }
//     }
// }


// Pattern-22
// public class Main {
//     public static void main(String[] args) {

//         int n = 4;

//         for(int row = 1; row <= n; row++) {

//             for(int col = 1; col <= n - row; col++) {
//                 System.out.print("  ");
//             }

//             for(int col = 1; col <= row; col++) {
//                 System.out.print((char)('A' + col - 1) + " ");
//             }

//             char toPrint = (char)('A' + row - 2);
            
//             for(int col = 1; col <= row - 1; col++) {
//                 System.out.print(toPrint + " ");
//                 toPrint--;
//             }

//             System.out.println();
//         }
//     } 
// }


//=====Practice-Pattern-Question=====

// public class Main {
//     public static  void main(String[] args) {

//         int n = 4; 

//         //Part-1
//         for(int row = 1; row <= n; row ++) {

//             for(int col = 1; col <= n - row; col++) {
//                 System.out.print("  ");
//             }

//             //Part-2
//             for(int col = 1; col <= row;  col++) {
//                 System.out.print("* ");
//             }

//             //Part-3
//             for(int col = 2; col <= row; col++) {
//                 System.out.print("* ");
//             }

//             System.out.println();
//         }
//     }
// }


// public class Main {
//     public static void main(String[] args) {

//         int n = 4;

//         for(int row = 1; row <= n; row++) {

//             for(int col = 1; col <= row - 1; col++) {
//                 System.out.print(" ");
//             }

//             for(int col = 1; col <= n - row + 1; col++) {
//                 System.out.print("* ");
//             }

//             System.out.println();
//         }
//     }
// }



public class Main {
    public static void main(String[] args) {
        int n = 4;
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println("  ");
        }
    }
}