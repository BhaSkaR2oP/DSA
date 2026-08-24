import java.util.Scanner;

public class DigOcurrance {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int digit=sc.nextInt();
        int count = 0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            if(rem==digit)
                count++;
        }
        System.out.println(count);
    }
}