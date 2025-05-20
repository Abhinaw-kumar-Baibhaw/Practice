public class RotateArray2 {
    public static void rotate(int[] nums, int k) {
        int l = 0;
           for(int i=nums.length-1;i>=0;i--){
              if(i>=k){
             int temp = nums[i];
              for(int j=i-1;j>=0;j--){
                int res = nums[j];
                nums[++j] = res;
              }
              nums[l] = temp;
              l++;
              }
           }
        }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(arr,k);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
