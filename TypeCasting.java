import java.util.*;
public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*AUTOMAIC Type Convesion(TypeCasting) happens when:
           1. both types are compatible eg.(int and float)
           2. dest type(LHS)> source type(RHS)
         */

        //implicit type conversion
        float num1= input.nextInt(); //works
        //int num1= input.nextFloat(); //not works
        //int num1= input.nextInt(); // will not work if u give float on input
        System.out.println(num1);

        //TypeCasting helps to convert small datatype to large eg.-int to float

        //explicit type conversion
        //int num2 = 47.45f; // not works
        int num2 = (int)(47.65f);
        System.out.println(num2);

        // automatic type promotion in expressions
//        int a =257;
//        byte b = (byte)(a);  // 257 % 256= 1
//        System.out.println(b);

        int number ='a'; //ASCII VALUE
        int numberr = 'A';
        System.out.println(number);
        System.out.println(numberr);


    }
}
