import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class TodayWork {

    public void prob(){
        int[] arr = {6,1,2,3,4};
        HashSet<Integer> h = new HashSet<>();
        int c = 0;
        int longest = 1;
        for(int i = 0 ; i < arr.length; i++){
            h.add(arr[i]);
        }
        for(int i = 0; i<arr.length;i++){
                if(!h.contains(arr[i]-1)){
                    c++;
                    int x = arr[i];
                    while(h.contains(x+1)){
                        x++;
                        c++;
                    }
             longest = Math.max(longest,c);
                }
        }
        System.out.println(longest);
    }


    public void problem(){
        String s = "abhinaw";
        String res = "";
        for(int i =s.length()-1 ; i>=0;i--){
            res = res + s.charAt(i);
        }
        System.out.println(res);
    }

    public void problem1(){
        String s = "Hello World";
        int v=0,c=0;
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                v++;
            }
            else{
                c++;
            }
        }
        System.out.println("vowels : "+v+" consonants : "+c);
    }

    public void problem2(){
        String s = "kanak";
        String s1 = "";
        for(int i = s.length()-1; i>=0;i--){
            s1 = s1 + s.charAt(i);
        }
        if(s.equals(s1)){
            System.out.println("String is palindrome");
        }
        else {
            System.out.println("String is not palindrome");
        }
    }

    public void  problem3(){
        String s = "hello world";
        char remove = 'o';
       s = s.replace(String.valueOf(remove),"");
        System.out.println(s);
    }

    public void problem4(){
       String s = "This is a Java program";
       int c = 0;
        String[] ch = s.split(" ");
        System.out.println(ch.length);
    }


    public void problem5(){
        String s1 = "listen";
        String s2 = "silent";
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        char[] s = s1.toCharArray();
        char[]  s3 = s2.toCharArray();
        Arrays.sort(s);
        Arrays.sort(s3);
        if(Arrays.equals(s,s3)){
            System.out.println("Anagram");
        }
        else {
            System.out.println("Not Anagram");
        }
     }


     public void problem6(){
        String s = "hello world";
        char rep = 'o';
        s = s.replace(String.valueOf(rep),"@");
         System.out.println(s);
     }

     public void problem7(){
        String s = "abcbccbcbaaa";
        HashMap<Character, Integer> h = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!h.containsKey(s.charAt(i))){
                h.put(s.charAt(i),1);
            }
            else
            {
                h.put(s.charAt(i),h.get(s.charAt(i))+1);
            }
        }
        for(Character key : h.keySet()){
            System.out.println(key +" "+h.get(key));
        }
     }

     public void problem8(){
        StringBuffer s = new StringBuffer("abhinaw");
        s.reverse();
         System.out.println(s);
     }

     public void problem9(){
         int arr[]={4,2,-6,1,3,5,2,-3,4,2};
         int max = Integer.MIN_VALUE;
         int sum = 0;
         for(int i = 0;i<arr.length;i++){
             sum = sum + arr[i];
             if(sum > max){
                 max = sum;
             }
             if(sum<0){
                 sum = 0;
             }
         }
         System.out.println(max);
     }

     public void problem10(){
        int n = 2;
        int c=0;
        if(n<=1) {
            System.out.println("Not Prime");
        }
        for(int i = 2; i< Math.sqrt(n);i++){
            if(n%i==0){
                c++;
                break;
            }
        }
        if(c>0){
            System.out.println("Not Prime");
        }
        else{
            System.out.println("Prime");
        }
     }

     public void problem11(){
        int a = 0, b=1;
         System.out.print(a +" "+b+" ");
        for(int i=1;i<10;i++){
            System.out.print(a+b+" ");
            int temp = a+ b;
            a=b;
            b=temp;
        }
     }

     public void problem12(){
        int arr[]={4,2,-6,1,3,5,2,-3,4,2};
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
            if(sum > max){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        System.out.println(max);
    }

    public void problem13(){
        int arr[]={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int sum = 0;
        int j = 0,k=0;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            sum = sum  + arr[i];
            if(sum > max){
                max = sum;
                k=i;
            }
            if(sum < 0){
                sum = 0;
            }
            if(sum == 0){
                j = i;
            }
        }
        while(++j<=k){
            System.out.print(arr[j]+" ");
        }
    }


    
}
