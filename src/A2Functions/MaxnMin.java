package A2Functions;

import java.util.Scanner;
public class MaxnMin {//using functions to find max and min value of three numbers
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int first=in.nextInt();
        int second=in.nextInt();
        int third=in.nextInt();
        int Max=Max(first,second,third);
        int Min=Min(first,second,third);
        System.out.println("Max: "+Max+" "+"Min: "+Min);
    }
    //My approach
//    public static int Max(int first,int second,int third)
//    {
//        int max;
//        if(first>second && first>third) max=first;
//        else if(second>first && second>third) max=second;
//        else max=third;
//        return max;
//    }
//    public static int Min(int first,int second,int third)
//    {
//        int min;
//        if(first<second && first<third) min=first;
//        else if(second<first && second<third) min=second;
//        else min=third;
//        return min;
//    }
    //Clever approach
    public static int Max(int first,int second,int third)
    {
        int max=first;
        if(second>max) max=second;
        if(third>max) max=third;
        return max;
    }
    public static int Min(int first,int second,int third)
    {
        int min=first;
        if(second<first) min=second;
        if(third<min) min=third;
        return min;
    }
}
