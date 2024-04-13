package A1SimpleJavaPrograms;
import java.util.Scanner;

class Solution
{
    public boolean isHappy(int n)
    {
        int rem,value=0;
        boolean ans=false;
        int count=0;
        while(count<10)
        {
            while (n > 0)
            {
                rem = n % 10;
                value = (rem * rem) + value;
                n = n / 10;
            }
            if (value != 1)
            {
                n = value;
                value = 0;
                count++;
            }
            else
            {
                ans = true;
                break;
            }
        }
        return ans;
    }
}
public class HappyNumber
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n");
        int n = in.nextInt();
        Solution s=new Solution();
        boolean ans = s.isHappy(n);
        System.out.println(ans);
    }
}

//import java.util.Scanner;

//class A1_Simple_Java_Programs.Solution {
//    public boolean isHappy(int n)
//    {
//        int rem,value=0;
//        boolean ans=false;
//        while(n>0)
//        {
//            rem=n%10;
//            value=(rem*rem)+value;
//            n=n/10;
//        }
//        if (value == 1) ans=true;
//        else isHappy(n);
//        return ans;
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter n");
//        int n = in.nextInt();
//        int rem,value=0;
//        while(true)
//        {
//            while(n>0)
//            {
//                rem=n%10;
//                value=(rem*rem)+value;
//                n=n/10;
//            }
//            if(value!=1)
//            {
//                n=value;
//                value=0;
//            }
//            else
//            {
//                ans=true;
//                break;
//            }
//        }
//    }
//}