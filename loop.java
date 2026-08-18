// for loop
public class Main {
    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        for(int i = 1; i <= 5; i++) {
            System.out.println("Hello java");
        }

        for(int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
    }
}


// Nested for loop
public class Main {
    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5; j++) {
                    System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = 1; i <= 3; i++) {
            for(int j = 1; j <= 3; j++) {
                System.out.println("i = " + i + ", j = " + j);
            }
        }
    }
}


// break and continue statement
public class Main {
    public static void main(String[] args) {
        // break
        for(int i = 1; i <= 10; i++) {
            if(i == 5) {
                break;
            }
            System.out.println(i);
        }

        // continue
        for(int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}



// While loop
public class Main {
    public static void main(String[] args) {

        int i = 1;
        while(i <= 5) {
            System.out.println(i);
            i++;
        }
    }
}


// Nested while loop
public class Main {
    public static void main(String[] args) {

        int i = 1;
        while(i <= 5) {
            int j = 1;

            while(j <= 5) {
                System.out.println("i = " + i + ", j = " + j);
                j++;
            }
            i++;
        }
    }
}


// do-while-loop
public class Main {
    public static void main(String[] args) {

        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while(i <= 5);
    }
}

