public class ReverseString {

    public static String reverseString(String str){
         String s = "";
         for(int i=str.length()-1;i>=0;i--){
            s = s + str.charAt(i);
         }
       return s;
    }
    public static void main(String[] args) {
        String s = "abhinaw";
        String res = reverseString(s);
        System.out.println(res);
    }
}
