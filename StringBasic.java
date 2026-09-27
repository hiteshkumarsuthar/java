// // ----String----

// import java.util.Scanner;
// public class StringBasic {
//     static void main() {

//         // create a string
//         String firstName = "Hitesh";
//         String lastName = new String("Suthar");

//         // Access the string
//         System.out.println("Name is : " + firstName + " " + lastName);

//         // Access string length
//         System.out.println("Length is : " + firstName.length());

//         // Access characters inside string 
//         System.out.println("2nd index in firstName is : " + firstName.charAt(2));

//         // This is not an update; it is **reference shifting**.
//         // 1. The `str` reference initially refers to `"Hitesh"`.
//         // 2. After reassignment, the `str` reference refers to `"Suthar"`.
//         // Therefore, the second method demonstrates **reference shifting**, not updating the original string.

//         // Create a string
//         String str = "Hitesh"; 
    
//         str = "Suthar";
//         System.out.println(str);

//         // Comparing String
//         String name1 = "Hitesh";
//         String name2 = "HITESH";

//         if(name1 == name2) {
//             System.out.println("Both are equal");
//         }
//         else {
//             System.out.println("Both are not equal");
//         }

//         if(name1.equals(name2)) {
//             System.out.println("Both are equal");
//         }
//         else {
//             System.out.println("Both are not equal");
//         }

//         if(name1.equalsIgnoreCase(name2)) {
//             System.out.println("Both are equal");
//         }
//         else {
//             System.out.println("Both are not equal");
//         }



//         // String Input
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Provide the string content : ");
        
//         //1. nextLine()
//         String str1 = sc.nextLine();
//         System.out.println("Value : " + str1);

//         //2. next()
//         System.out.println("Provide the 2nd string content : ");
//         String str2 = sc.next();
//         System.out.println("Value : " + str2);
//     }
// }




public class StringBasic {
    static void main() {
        
        // Methods

        //=>lenght(), charAt(), equals(), equalsIgnoreCase()
        String name = "Hitesh";
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        String name2 = "HITESH";
        System.out.println(name.equals(name2));
        System.out.println(name.equalsIgnoreCase(name2));

        
        //=>isEmpty(), isBlank()
        String str = " ";
        System.out.println(str.length());
        System.out.println(str.isEmpty());
        System.out.println(str.isBlank());


        //=> trim()
        String str1 = "   Hitesh   ";
        System.out.println(str1.length());
        str = str1.trim();
        System.out.println(str.length());


        //=> toUpperCase(), toLowerCase()
        String name = "Hitesh";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());


        //=> substring(), contains()
        String str = "My name is Hitesh";
        // // beginIndex -> 3 -> inclusive
        // // endIndex -> 7 -> exclusive
        System.out.println(str.substring(3, 7));
        System.out.println(str.contains("Hitesh"));


        //=> valueOf()
        int num = 21051;
        String str = String.valueOf(num);
        System.out.println(num+1);
        System.out.println(str+1);


        //=> startWith(), endsWith()
        String name = "Hitesh Kumar Suthar";
        System.out.println(name.startsWith("Hitesh"));
        System.out.println(name.endsWith("Suthar"));


        //=> toCharArray()
        String name = "Hitesh";
        char[] cr = name.toCharArray();

        for(char ch: cr) {
            System.out.println("Value of char : " + ch);
        }

         
        //=> split()
        // //  split -> output -> string array
        String input = "My,name,is,Hitesh,Kumar,Suthar";
        String[] words = input.split(",");
        for(String str: words) {
            System.out.println(str);
        }


        //=> replace()
        String name = "Hitesh";
        name = name.replace('H', 'R');
        System.out.println(name);


    }
}