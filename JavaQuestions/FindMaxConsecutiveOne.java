public class FindMaxConsecutiveOne {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int c = 0;
        int sc = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                c = c + 1;
                if(sc < c){
                    sc = c;
                }
            }
            else{
                c=0;
            }
        }
        return sc;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        int res = findMaxConsecutiveOnes(arr);
        System.out.println(res);
    }
}
