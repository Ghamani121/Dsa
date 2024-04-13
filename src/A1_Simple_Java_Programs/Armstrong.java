package A1_Simple_Java_Programs;

import java.util.Scanner;

public class Armstrong
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=in.nextInt();
        int store=n;
        int rem,ans=0;
        while(n>0)
        {
            rem=n%10;
            ans+=rem*rem*rem;
            n=n/10;
        }
        if(store==ans) System.out.println("Number is armstrong");
        else System.out.println("Number is not armstrong");
    }
}
