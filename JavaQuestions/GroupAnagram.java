import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {

       public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> h = new HashMap<>();
         for(String word : strs){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if(h.containsKey(sorted)){
                h.get(sorted).add(word);
            }
            else{
                List<String> l = new ArrayList<>();
                l.add(word);
                h.put(sorted, l);
            }
         }       
         return new ArrayList<>(h.values());
       }

    public static void main(String[] args) {
      String[]  strs = {"eat","tea","tan","ate","nat","bat"};
     List<List<String>> ans = groupAnagrams(strs);
     System.out.println(ans);
    }
}
