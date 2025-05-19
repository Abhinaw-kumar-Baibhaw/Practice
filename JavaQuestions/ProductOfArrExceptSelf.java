public class ProductOfArrExceptSelf {
    public static void productOfArrExceptSelf(int[] arr){
    int[] nums = new int[arr.length];
    int[] suffix = new int[arr.length];
    int[] prefix = new int[arr.length];
    prefix[0] = 1;
    suffix[arr.length-1] = 1;
    for(int i = 1;i<arr.length;i++){
        prefix[i] = prefix[i-1] * arr[i-1];
    }
    for(int i = arr.length - 2; i>=0; i--){
        suffix[i] = suffix[i+1] * arr[i+1];
    }
    for(int i =0 ; i<arr.length;i++){
        nums[i] = prefix[i] * suffix[i];
    }
    for(int i=0;i<nums.length;i++){
        System.out.print(nums[i]+" ");
    }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        productOfArrExceptSelf(arr);
    }
}
