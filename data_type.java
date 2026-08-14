// Basic Program
public class DataTypes {
    static void main() {

        // Numeric Datatype
        byte num = 120;
        System.out.println(num);

        short num1 = 23543;
        System.out.println(num1);

        int num2 = 1200000;
        System.out.println(num2);

        long num3 = 123456789;
        System.out.println(num3);

        // floating Datatype
        float num4 = 5.123f;
        System.out.println(num4);

        double num5 = 12.78946557667f;
        System.out.println(num5);

        // other - Char, Boolean
        boolean eligibleforvote = true;
        System.out.println(eligibleforvote);

        char firstcharacter = 'H';
        System.out.println("My first character is : "  + firstcharacter);   
        System.out.println((char)(firstcharacter+2));


        // Type conversion
        long value1 = 123456789;
        int value2 = (int)value1;
        System.out.println(value2);

        char character = 'D';
        System.out.println((char)(character+2));
    }
}