import java.util.HashMap;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!h.containsKey(nums[i])){
                h.put(nums[i],1);
            }
            else{
                h.put(nums[i],h.get(nums[i])+1);
            }
        }
        for(Integer key : h.keySet()){
            if(h.get(key)==1){
                return key;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {2,2,1};
        int res = singleNumber(arr);
        System.out.println(res);
    }
}
