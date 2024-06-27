package A4Searching;

class NextGreatestLetter4 {
    public char nextGreatestLetter(char[] letters, char target) {
        int start=0,end=letters.length-1,mid=0;
        if(target>letters[letters.length-1]) return letters[0];
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(target<letters[mid]) end=mid-1;
            else start=mid+1;
        }
        return letters[start%letters.length];//returns value of given index normally but when index is equal to letters.length return first index
    }
}
