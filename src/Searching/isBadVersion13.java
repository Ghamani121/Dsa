//package Searching;
//
//public class isBadVersion13 {
////    The isBadVersion API is defined in the parent class VersionControl.
//      boolean isBadVersion(int version);
//
//    public class isBadVersion13 extends VersionControl {
//        public int firstBadVersion(int n) {
//            int start=0,end=n;
//            while(start<end)
//            {
//                int mid=start+(end-start)/2;
//                if(!isBadVersion(mid)) //our mid value is not bad, we need to move forward and find first bad version
//                {
//                    start=mid+1;
//                }
//                else end=mid;
//            }
//            return end;
//        }
//    }
//}
