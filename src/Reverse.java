import java.util.Scanner;

public class Reverse{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter n");
        int n=in.nextInt();
        int rem,reverse=0,a=0;
        while(n>0)
        {
            rem=n%10;
            n=n/10;
            a=a*10+rem;
        }
        System.out.println("Reversed String:"+a);
    }
}
