public class FindDifferenceinString {
     public static char findTheDifference(String s, String t) {
        char result=0;
        for (char e : s.toCharArray()){
            result=(char)(result^e);
        }
        for(char e : t.toCharArray()){
            result=(char)(result^e);
        }
        return result;
    }
    public static void main(String[] args) {
        String s="abcd";
        String t="abcde";
        System.out.println(findTheDifference(s,t));
    }
}
