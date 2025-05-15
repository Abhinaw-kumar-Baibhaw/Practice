import java.util.Arrays;
import java.util.HashMap;

public class TwoSum2 {

    public static int[] twoSum(int[] nums, int target){

      HashMap<Integer,Integer> h = new HashMap<>();
      for(int i=0;i<nums.length;i++){
         int res = target - nums[i];
         if(h.containsKey(res)){
            return new int[]{h.get(res),i};
         }  
         h.put(nums[i],i);
    }
    return new int[]{};
    }
    public static void main(String[] args) {
        int[] nums = {1, 6, 2, 10, 3};
       int target = 7;
       int[] res = twoSum(nums,target);
       System.out.println(Arrays.toString(res));
    }
}
