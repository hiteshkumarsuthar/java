// ----2-D ARRAY----

// public class Array {
//     static void main() {

//         // decalartion
//         int[][] arr;

//         // allocation
//         arr = new int[3][4];


//         // init
//         // int[][] brr = {
//         //     {1,2}, 
//         //     {3,4}, 
//         //     {5,6}, 
//         //     {7,8}
//         //     };

//         // // System.out.println(brr[][]);
        
//         // int rowlength = brr.length;

//         // // brr[0].length -> This use of only fixed column in array
//         // int collength = brr[0].length;

//         // // Using Nested Loop
//         // for(int rowindex = 0; rowindex <= rowlength-1; rowindex++) {
//         //     for(int colindex = 0; colindex <= collength-1; colindex++) {
//         //         System.out.print(brr[rowindex][colindex] + " ");
//         //     }
//         //     // Next Line Print
//         //     System.out.println();
//         // }




//         // Jagged 2-D Array
//         int[][] brr = {
//             {1,2}, 
//             {3,4,5,6,8}, 
//             {5,6,8,9}, 
//             {7}
//             };

//             // System.out.println(brr[][])  
        
//         int rowlength = brr.length;

//         // Using Nested Loop
//         for(int rowindex = 0; rowindex <= rowlength-1; rowindex++) {

//             //jaise hi main kisi new row me aaya
//             //same point pr maine uss row ka colLength find out krlia
//             //current row -> brr[rowIndex]
//             //isme kitne columns -> brr[rowIndex].length
//             int collength = brr[rowindex].length;

//             for(int colindex = 0; colindex <= collength-1; colindex++) {
//                 System.out.print(brr[rowindex][colindex] + " ");
//             }
//             // Next Line Print
//             System.out.println();
//         }
//     }
// }
      

    

// ----Jagged 2-D Array----
// → 4 row references, columns har row ke liye baad mein alag-alag allocate kar sakte ho.
// abhi personal array mai row ke liye memory allocate kar skte ho diff.- diff. size ki

// "NOTE -> Ye method Jagged Array banane ke liye use hota hai"

// public class Main {
//     public static void main(String[] args) {

//         int[][] arr = new int[4][];

//         arr[0] = new int[2];
//         arr[1] = new int[10];
//         arr[2] = new int[5];
//         arr[3] = new int[1];

//         System.out.println(arr[0].length); // 2
//         System.out.println(arr[1].length); // 10
//         System.out.println(arr[2].length); // 5
//         System.out.println(arr[3].length); // 1
//     }
// }



// ----Traversal 2-D Array----
// public class Array {
//     static void main() {

        
//     int[][] brr = {
//             {1,2}, 
//             {3,4,5,6,8}, 
//             {5,6,8,9}, 
//             {7}
//             };
              
//     // Using this method to solve Jagged Array
//     for(int rowindex = 0; rowindex <= brr.length-1; rowindex++) {
//         for(int colindex = 0; colindex <= brr[rowindex].length-1; colindex++) {
//             System.out.print(brr[rowindex][colindex] + " ");
//         }
//             System.out.println();
//         }
//     }
// }



// ----INPUT/OUTPUT IN 2-D ARRAY----
import java.util.Scanner;
public class Array {
    static void main() {
        int arr[][] = new int[3][4];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i <= arr.length-1; i++) {
            for(int j = 0; j <= arr.length-1; j++) {
                System.out.println("Provide value for row = " + i + "and column=" + j);
                arr[i][j] = sc.nextInt();
            }
        }

        for(int rowindex = 0; rowindex <= arr.length-1; rowindex++) {
            for(int colindex = 0; colindex <= arr[rowindex].length-1; colindex++) {
                System.out.print(arr[rowindex][colindex] + " ");
            }
            System.out.println();
        }
    }
}

