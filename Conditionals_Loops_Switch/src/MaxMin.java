import java.util.*;

public class MaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Largest of 3 nos

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
//        int max=a;
//        if(b>max)
//            max=b;
//        if(c>max)
//            max=c;
//        else
//            max=a;
//        System.out.println("Max no is:"+max);

        // Or

        int max = Math.max(c, Math.max(a, b));
        System.out.println(max);
    }
}
