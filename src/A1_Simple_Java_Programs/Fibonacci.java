package A1_Simple_Java_Programs;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the A1_Simple_Java_Programs.Fibonacci value you need");
        int n=in.nextInt();
        System.out.println("Enter input 1");
        int n1=in.nextInt();
        System.out.println("Enter input 2");
        int n2=in.nextInt();
        int[] a=new int[n];
        int i=1;
        while (i<=n)
        {
            int fib;
            fib=n1+n2;
            n1=n2;
            n2=fib;
            i++;
            if(i==n) System.out.println(fib);
        }
    }
}
