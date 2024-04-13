package A1_Simple_Java_Programs;

import java.util.Scanner;

public class Perfect {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter n");
        int n= in.nextInt();
        int ans=0;
        for(int i=1;i<n;i++){
            if(n%i==0) ans += i;
        }
        if(ans==n) System.out.println("Number is perfect");
        else System.out.println("Number is not perfect");
    }
}
