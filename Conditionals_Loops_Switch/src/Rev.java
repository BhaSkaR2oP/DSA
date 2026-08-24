import java.util.Scanner;

public class Rev {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev=0;
        while(n>0){
            int digit=n%10;
            n/=10;
            rev=(rev*10)+digit;
        }
        System.out.println(rev);
    }
}