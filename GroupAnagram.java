import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
    public static List<List<String>> groupAnagrams(String[] strs) {
        //Approach 1
    //     Map<String,List<String>> map = new HashMap<>();
    //     for(String word : strs){
    //         char w[]=word.toCharArray();
    //         Arrays.sort(w);
    //         String key= new String(w);
    //         map.computeIfAbsent(key,k->new ArrayList<>()).add(word);
    //     }
    //     return new ArrayList<>(map.values());

 

    //Approach 2


         Map<String,List<String>> map = new HashMap<>();
         for(String word : strs){
            int countArr[]= new int[26];
            for( char c: word.toCharArray()){
                countArr[c-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i : countArr){
            sb.append(i).append('#');
            }
            String key = sb.toString();
            map.computeIfAbsent(key,k-> new ArrayList<>()).add(word);
         }
         return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        String strs[]={"eat","tea","tan","ate","nat","bat"};
      List<List<String>> l=  groupAnagrams(strs) ;
      for(List<String> sl : l){
        for(String s : sl){
            System.out.print(s+" ");
        }
        System.out.println();
      }
    }
    
}
