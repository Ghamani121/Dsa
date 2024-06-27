package A4Searching;

public class ReachANumber26  {
    public int reachNumber(int target) {
        int sum=0,step=0;
        target=Math.abs(target);//to convert target value to positive
        while(sum<target)//get the steps equal or more than target
        {
            step++;
            sum+=step;
        }
        while((sum-target)%2 != 0)//if value is odd, we cant move to negative side as it is 2*i
        //aka we need difference to be even to move to left
        {
            step++;
            sum+=step;
        }
        return step;
    }
}
