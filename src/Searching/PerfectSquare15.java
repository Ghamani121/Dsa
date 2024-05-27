package Searching;

public class PerfectSquare15{
        public boolean isPerfectSquare(int num) {
            int start=0,end=num;
            while(start<=end)
            {
                long mid=start+(end-start)/2;//used long to prevent overflow of mid variable
                if(num==mid*mid) return true;
                else if(num>mid*mid) start=(int)mid+1;//have to convert mid to int as it is the only way toadd it with ither int variables
                else end=(int)mid-1;
            }
            return false;
        }
    }

