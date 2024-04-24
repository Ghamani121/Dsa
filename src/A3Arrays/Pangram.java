package A3Arrays;
//3ms
//class Pangram {
//    public boolean checkIfPangram(String sentence) {
//        boolean[] count=new boolean[26];
//        for(int i=0;i<sentence.length();i++)
//        {
//            char sen=sentence.charAt(i);
//            if(Character.isLetter(sen))
//            {
//                count[sen-'a']=true;
//            }
//        }
//        for(boolean i:count)
//        {
//            if(!i) return false;
//        }
//        return true;
//    }
//}
//optimised 0ms
class Pangram{
    public boolean checkIfPangram(String sentence) {

        for(int i=97 ; i<=122; i++){
            if(!sentence.contains(""+(char)i))
                return false;
        }
        return true;
    }
}