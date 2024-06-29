package A3Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class candy {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list= new ArrayList<>(candies.length);
        int max=candies[0];
        for(int i=0;i<candies.length;i++)
        {
            max=Math.max(max,candies[i]);
            candies[i]=candies[i]+extraCandies;
        }
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]>=max) list.add(true);
            else list.add(false);
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter n");
        int n= in.nextInt();
        int[] candies=new int[n];
        System.out.println("enter array");
        for (int i=0;i<n;i++)
        {
            candies[i]=in.nextInt();
        }
        System.out.println("enter extra candy");
        int extra= in.nextInt();
        candy s= new candy();
        System.out.println(s.kidsWithCandies(candies,extra));
    }
}
