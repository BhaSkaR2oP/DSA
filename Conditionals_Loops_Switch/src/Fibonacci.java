import java.util.*;
import java.lang.*;

public class Fibonacci {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int count = 2;
        int n = sc.nextInt();
        while (count <= n) {
            int temp = b;
            b += a;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}