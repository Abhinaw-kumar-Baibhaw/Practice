public class MaximumSubarrSum {
    public static int maximumSubarrSum(int[] arr){
        int max = 0;
        int sl = Integer.MIN_VALUE;
        int j = 0;
        while(j<arr.length){
            max  = max + arr[j];
            sl = Math.max(max, sl);
            if(max < 0){
                max = 0;
            }
        }
        return sl;

    }
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int res = maximumSubarrSum(arr);
        System.out.println(res);
    }
}
