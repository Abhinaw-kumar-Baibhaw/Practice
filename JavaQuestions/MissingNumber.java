public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int res = (nums.length * (nums.length + 1))/2;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
        }
        return (res - sum);
    }
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        int res = missingNumber(arr);
        System.out.println(res);
    }
}
