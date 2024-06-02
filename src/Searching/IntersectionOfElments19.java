package Searching;

public class IntersectionOfElments19 {
        public int[] intersection(int[] nums1, int[] nums2) {
            int n1=nums1.length,n2=nums2.length;
            if(n1<n2)
            {
                for(int a:nums1)
                {
                    binarysearch(a,nums1);
                }
                binarysearch(int target,int[] nums1)
                {
                    int start=0,end=n1;
                    while(start<end)
                    {
                        int mid=start+(end-start)/2;
                        if(nums1[mid]==target) return nums1[mid];
                    }
                }
            }

        }
    }