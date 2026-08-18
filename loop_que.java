// print count 1 to n
public class Main {
    public static void main(String[] args) {
        int i = n;
        for(int i = 1; i < n; i++) {
            System.out.println(i);
        }
    }
}



// print counting n to 1
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter number of n ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }
}



// print the 10 multiples of n
import java.util.Scanner;

public class loop_que {
    public static void main(String[] args) {

        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 10; i <= n; i+=10) {
            System.out.println(i);
        }
    }
}



// print name 100 times
public class Main {
    public static void main(String[] args) {

        for(int i = 1; i <= 100; i++) {
            System.out.println("Hitesh Kumar suthar");
        }
    }
}
