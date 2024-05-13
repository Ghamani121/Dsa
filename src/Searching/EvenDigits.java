package Searching;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums={18,124,9,-1764};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums)
    {
        int count=0;
        for (int num:nums)
        {
            if(even(num)) count++;
        }
        return count;
    }
    static boolean even(int num)
    {
        if(num<0) num*=-1;//to convert negative number to positive
//        int value=0,n=0;
//       while(num>0)
//       {
//          value++;
//          num=num/10;
//       }
       int value=(int)(Math.log10(num))+1;//gives count of number of digits
       return (value%2==0);
    }
}
