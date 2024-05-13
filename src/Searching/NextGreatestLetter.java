package Searching;

class NextGreatestLetter{
    public char nextGreatestLetter(char[] letters, char target) {
        int start=0,end=letters.length-1,mid=0;
        if(target<letters[0]) return letters[0];
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(target<letters[mid]) end=mid-1;
            else start=mid+1;
        }
        return letters[start%letters.length];
    }
}
