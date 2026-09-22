// Methods
// public class methods {
//     //declaration/defination
//     static void print_table() {
//         for(int i = 1; i <= 10; i++) {
//             int ans = 2 * i;
//             System.out.println("-> " + ans);
//         }
//     }
//     static void main() {
//         System.out.println("Hy");
//         //method call
//         print_table();
//         System.out.println("Bye");
//     }
// }


// Non-void method
// public class methods {
//     static int add(int p, int q) {
//         int sum = p + q;
//         return sum;
//     }

//     static void main() {
//         int result = add(12, 13);
//         System.out.println("SUM is -> " + result);
//     }
// }


// Method overloading example
// public class methods {
//     static int add(int a, int b) {
//         int sum = a + b;
//         return sum;
//     }

//     static int add(int a, int b, int c) {
//         int ans = a + b + c;
//         return ans;
//     }

//     static void main() {
//         int ans1 = add(1, 2);
//         int ans2 = add(1, 2, 3);

//         System.out.println("ans1 = " + ans1);
//         System.out.println("ans2 = " + ans2);
//     }
// }



// public class methods {
//     static void greeting() {
//         System.out.println("Welcome to java program!!");
//     }

//     public static void main(String[] args) {
//         greeting();
//     }
// }


// public class methods {
//     static int add(int a, int b) {
//         int sum = a + b;
//         return sum;
//     }

//     public void main() {
//         int result = add(10, 20);
//         System.out.println("Sum is : " + result);
//     }
// }


public class methods {
    static boolean is_even(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        boolean result = is_even(2);
        System.out.println(result);
    }
}