package A2Functions;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter n");
        int n= in.nextInt();
        prime(n);
        if(prime(n)) System.out.println("It is prime number");
        else System.out.println("It is not prime number");
    }
    public static boolean prime(int n)
    {
        if(n<=1) return false;
        for(int i=2;i<=n/2;i++)
            if(n%i==0) return false;
        return true;
    }
}
