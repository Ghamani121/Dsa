import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n= sc.nextInt();
        for(int tower=1;tower<=n;tower++)
        {
            for(int i=0;i<2*tower-1;i++)
            {
                if(i<tower)
                {
                    for(int j=0;j<=i;j++)
                    {
                        System.out.print("*");
                    }
                }
                else
                {
                    for(int j=1;j<2*tower-i;j++)
                    {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }
        for(int tower=n-1;tower>0;tower--)
        {
            for (int i = 0; i < 2 * tower - 1; i++)
            {
                if (i < tower) {
                    for (int j = 0; j <= i; j++)
                    {
                        System.out.print("*");
                    }
                }
                else
                {
                    for (int j = 1; j < 2 * tower - i; j++)
                    {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }
    }
}



//        for(int i=0;i<(int)Math.pow(i,2)*2+2*n-1;i++)
//        {
//            for(int j=0;j<i%12;j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //*     0,1
        //**
//        System.out.println("enter i");
//        int i= sc.nextInt();
//           n i  lines
//           1 0  (0)*2+1=1
//           2 1  (0+1)*2 +3=5
//           3 2  (0+1+3=4)*2 +5=13
//           4 3  (0+1+3+5=9)*2 +7=25
//           5 4  (0+1+3+5+7=16)*2 +9=41
//                           i^2*2+2n-1
//        System.out.println((int)Math.pow(i,2)*2+2*n-1);


//j   i
//1   0
//
//1   0
//1   1
//2   2
//1   3
//1   4
//
//1   0
//1   1
//2   2
//1   3
//1   4
//2   5
//3   6
//2   7
//1   8
//1   9
//2   10
//1   11
//1   12
//           n i  lines
//           1 0  (0)*2+1=1
//           2 1  (0+1)*2 +3=5
//           3 2  (0+1+3=4)*2 +5=13
//           4 3  (0+1+3+5=9)*2 +7=25
//           5 4  (0+1+3+5+7=16)*2 +9=41
//i   lines
//0   1=2*0-1
//1   3=2*1-1
//2   5=2*2-1
//3   7=2*3-1
//4   9=2*4-1 ...2*i-1