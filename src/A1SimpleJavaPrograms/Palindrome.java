package A1SimpleJavaPrograms;;

import java.util.Scanner;

public class Palindrome //To find palindrome of a string
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter string");
        String str=in.next();
        str=str.toLowerCase();
        int left=0;
        int right=str.length()-1;
        boolean isPalindrome=true;
        while(left<right)
        {
            if (str.charAt(left) != str.charAt(right))
            {
                isPalindrome=false;
                break;
            }
            left++;
            right--;
        }
        if(isPalindrome) System.out.println("String is palindrome");
        else System.out.println("String is not Palindrome");
    }

}
