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
public class methods {
    static int add(int p, int q) {
        int sum = p + q;
        return sum;
    }

    static void main() {
        int result = add(12, 13);
        System.out.println("SUM is -> " + result);
    }
}

