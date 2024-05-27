package Searching;

public class ArrangingCoins16 {
        public int arrangeCoins(int n) {
            long start=0,end=n;//to avoid overflow
            while(start<=end)
            {
                long mid=start+(end-start)/2;//mid is equal to number of complete rows
                long coinNeeded=mid*(mid+1)/2;//formula for sum of natural numbers
                if(coinNeeded==n) return (int)mid;//coins needed to form a complete row
                else if(coinNeeded<n) start=mid+1;
                else end=mid-1;
            }
            return (int)end;
        }
    }

