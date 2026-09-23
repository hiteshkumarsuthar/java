// -----Array-----
// -----1D Array-----

// public class Array {
//     static void main() {
//         // decalartion
//         int arr[];

//         // allocation
//         arr = new int[5];

//         // initialization
//         int brr[] = {10, 29, 34};

//         // Accessing value using index
//         System.out.println("Value of 0 zero index : " + brr[0]);
//         System.out.println("Value of first index : " + brr[1]);

//         // Accessing value using for loop
//         int n = brr.length;
//         for(int index = 0; index <= n-1; index++) {
//             System.out.println(brr[index]);
//         }

//         System.out.println();

//         // For Each loop
//         for(int value : brr) {
//             System.out.println(value);
//         }
//     }
// }



// import java.util.Scanner;
// public class Array {
//     static void main() {

//         int arr[] = new int[5];
//         Scanner sc = new Scanner(System.in);
//         int n = arr.length;

//         // Input from the user
//         for(int i = 0; i <= n-1; i++) {
//             System.out.println("Provide input for index " + i);
//             arr[i] = sc.nextInt();
//         }

//         // Print
//         System.out.println("You array contains : ");
//         for(int value : arr) {
//             System.out.println(value);
//         }
//     }
// }


// Sum array
// public class Array {
//     static void main() {
//         int arr[] = {10, 20, 30, 40, 100};
//         int sum = 0;
//         int n = arr.length;

//         for(int i = 0; i <= n-1; i++) {
//             int value = arr[i];
//             sum = sum + value;
//         }
//         System.out.println("Total sum value is : " + sum);
//     }
// }


// Multiply array
// public class Array {
//     static void main() {
//         int arr[] = {2, 4, 6, 8, 90};
//         int ans = 1;
//         int n = arr.length;

//         for(int i = 0; i <= n-1; i++) {
//             int value = arr[i];
//             ans = ans * value;
//         }
//         System.out.println("Total multiply value : " + ans);
//     }
// }


// Find maxValue
// public class Array {
//     static void main() {

//         int arr[] = {3, 5, -9, 11};
//         int n = arr.length;
//         int maxValue = arr[0];

//         for(int i = 0; i <= n-1; i++) {
//             if(arr[i] > maxValue) {
//                 maxValue = arr[i];
//             }
//         }
//         System.out.println("Max value is : " + maxValue);
//     }
// }


// Find minValue
// public class Array {
//     static void main() {

//         int arr[] = {2, 3, 89, 78, 1, -9};
//         int n = arr.length;
//         int minValue = arr[0];

//         for(int i = 0; i <= n-1; i++) {
//             if(arr[i] < minValue) {
//                 minValue = arr[i];
//             }
//         }
//         System.out.println("Min value is : " + minValue);
//     }
// }


// Linear Search 
// public class Array {
//     static void main() {

//         int arr[] = {10, 20, 30, 40, 50};
//         int target = 30;
//         int n = arr.length;

//         for(int i = 0; i <= n-1; i++) {
//             if (arr[i] == target) {
//                 System.out.println("I found the element in indexing : " + i);
//             }
//         }
//     }
// }


// Reverse Array (Two Pointer)
// public class Array {
//     static void main() {

//         int arr[] = {50, 40, 30, 20, 10};
//         int start = 0;
//         int end = arr.length-1;

//         while(start < end) {

//             // Swaping
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;

//             start++;
//             end--;
//         }

//         // Print array
//         for(int i = 0; i <= arr.length-1; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }




// ----2-D Array----

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

//         // System.out.println(brr[][]);
        
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



// Jagged 2-D Array
// → 4 row references, columns har row ke liye baad mein alag-alag allocate kar sakte ho.
// abhi personal array mai row ke liye memory allocate kar skte ho diff.- diff. size ki

// "NOTE -> Ye method Jagged Array banane ke liye use hota hai"

public class Main {
    public static void main(String[] args) {

        int[][] arr = new int[4][];

        arr[0] = new int[2];
        arr[1] = new int[10];
        arr[2] = new int[5];
        arr[3] = new int[1];

        System.out.println(arr[0].length); // 2
        System.out.println(arr[1].length); // 10
        System.out.println(arr[2].length); // 5
        System.out.println(arr[3].length); // 1
    }
}

