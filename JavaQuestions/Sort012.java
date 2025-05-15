public class Sort012 {
    public static int[] sortColors(int[] nums) {
      int start = 0;
      int mid = 0;
      int end = nums.length-1;
      while(mid<=end){
        if(nums[mid]==2){
            int temp = nums[mid];
            nums[mid] = nums[end];
            nums[end] = temp;
            end--;
           
        }
        else if(nums[mid]==1){
           mid++;
        }
        else{
            int temp = nums[start];
            nums[start] = nums[mid];
            nums[mid] = temp;
            start++;
            mid++;
        }
      }
      return nums;
    }
    
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        int[] rs = sortColors(nums);
        for(int i=0;i<rs.length;i++){
            System.out.print(rs[i]+" ");
        }
    }
}
