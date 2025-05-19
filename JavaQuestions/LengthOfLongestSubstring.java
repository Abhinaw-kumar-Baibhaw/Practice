import java.util.HashSet;

public class LengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
       HashSet<Character> h = new HashSet<>();
        int left=0;
        int length=1;
        if(s.length()==0) return 0; 
        for(int right=0;right<s.length();right++){
           if(h.contains(s.charAt(right))){
                while(left < right && h.contains(s.charAt(right))){
                    h.remove(s.charAt(left));
                    left++;
                }
           }
          h.add(s.charAt(right));
          length = Math.max(length,right - left + 1);
        }
        return length;
    }

    public static void main(String[] args) {
        String str = "abcabcbb";
        int res = lengthOfLongestSubstring(str);
        System.out.println(res);
    }
}