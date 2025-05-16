public class ValidPalindrome {
    public static boolean validPalindrome(String str){
        String newString = str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String reverse = new StringBuilder(newString).reverse().toString();
        return newString.equals(reverse);
    }
    public static void main(String[] args) {
        String s = "race a car";
        boolean res = validPalindrome(s);
        System.out.println(res);
    }
    
}
