import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.charAt(0) >= 'a' && s.charAt(0) <= 'z')
            System.out.println("Lowercase");
        else if(s.charAt(0) >= 'A' && s.charAt(0) <= 'Z') {
            System.out.println("Uppercase");
        }
        else
            System.out.println("Invalid");
    }
}