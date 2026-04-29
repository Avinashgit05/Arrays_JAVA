import java.util.HashMap;
import java.util.Map;

public class WordPattern {
     public static boolean wordPattern(String pattern, String s) {
        String str[]=s.split(" ");
        if(str.length!=pattern.length()){
            return false;
        }
        Map<Character,String> map1=new HashMap<>();
         Map<String,Character> map2=new HashMap<>();
        for(int i =0;i<pattern.length();i++){
            char p=pattern.charAt(i);
            String c=str[i];
            if(map1.containsKey(p)){
                if(!map1.get(p).equals(c)){
                    return false;
                }
            }
            else{
                map1.put(p,c);
            }


             if(map2.containsKey(c)){
                if(!map2.get(c).equals(p)){
                    return false;
                }
            }
            else{
                map2.put(c,p);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String pattern="abba";
        String s= s = "dog cat cat dog";
        System.out.println( wordPattern(pattern, s));
    }
    
}
