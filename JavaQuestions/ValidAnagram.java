import java.util.Arrays;

public class ValidAnagram {
     public static boolean isAnagram(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }

        char[] s1 = s.toLowerCase().toCharArray();
        char[] s2 = t.toLowerCase().toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);

        return Arrays.equals(s1, s2);
    }

    public static void main(String[] args) {
        String s = "eat";
        String t = "ate";
        boolean rs = isAnagram(s,t);
        System.out.println(rs);
    }
}
