package Searching;
    class Square00 {
        public int mySqrt(int x) {
            int start=1,end=x,mid=0;
            if(x==0 ||x==1) return x;
            while(start<=end)
            {
                mid=start+(end-start)/2;
                if((long)mid*mid>(long)x) end=mid-1;//adding long here prevents integer overflow
                else if(mid*mid==0) return mid;
                else start=mid+1;
            }
            return Math.round(end);
        }
    }

