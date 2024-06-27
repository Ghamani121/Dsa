package A4Searching;

public class SearchString1 {
    public static void main(String[] args) {
        String name="Kunal";
        char target='h';
        boolean value=Search(name,target);
        System.out.println(value);
    }
    static boolean Search(String str,char target)
    {
        if(str.length()==0) return false;
//        for(int i=0;i<str.length();i++)
//        {
//            if(target==str.charAt(i)) return true;
//        }
        for(char ch:str.toCharArray())
        {
            if(ch==target) return true;
        }
        return false;
    }
}
