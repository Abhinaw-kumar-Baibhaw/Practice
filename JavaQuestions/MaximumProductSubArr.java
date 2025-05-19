
public class MaximumProductSubArr {

    public static int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int maxProd = nums[0];
        int currMax = nums[0];
        int currMin = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            if (num < 0) {
                int temp = currMax;
                currMax = currMin;
                currMin = temp;
            }
            currMax = Math.max(num, currMax * num);
            currMin = Math.min(num, currMin * num);
            maxProd = Math.max(maxProd, currMax);
        }
        return maxProd;
    }
    
    public static void main(String[] args) {
        int[] arr = {2,3,-2,4};
        int res = maxProduct(arr);
        System.out.println(res);
    }
}