public class ReverseWordsInString {
    public static String reverseWordsInString(String str){
        String[] str1 = str.trim().split("\\s+");
        StringBuilder s = new StringBuilder();
        for(int i = str1.length -1 ;i>=0;i--){
            s.append(str1[i]);
            if(i!=0){
                s.append(" ");
            }
        }
        return s.toString();
    }
    public static void main(String[] args) {
        String str = "the sky is blue";
        String res = reverseWordsInString(str);
        System.out.println(res);
    }
    
}
