import java.util.HashMap;

public class FindDuplicates {
    public static void findDuplicates(int[] arr){
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!h.containsKey(arr[i])){
                h.put(arr[i],1);
            }
            else{
                h.put(arr[i],h.get(arr[i])+1);
            }
        }
        for(Integer key : h.keySet()){
            if(h.get(key)>1){
                System.out.print(key+" ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,1,4,5,3};
        findDuplicates(arr);
    }
}