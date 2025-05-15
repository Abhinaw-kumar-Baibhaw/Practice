import java.util.Arrays;

public class TwoSum1 {
    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = 0 ; j < nums.length; j++){
                if(nums[i]+nums[j]==target){
                 res[0]=j;
                 res[1]=i;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
       int[] nums = {1, 6, 2, 10, 3};
       int target = 7;
       int[] res = twoSum(nums,target);
       System.out.println(Arrays.toString(res));
    }
}
