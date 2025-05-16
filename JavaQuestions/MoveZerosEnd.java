public class MoveZerosEnd {
    public static void moveZeroes(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                int temp = nums[i];
                int k = i;
                for(int j=i+1;j<nums.length;j++){
                    nums[k]=nums[j];
                    if(j==nums.length-1){
                        k++;
                        nums[k]=temp;
                    }
                    k++;
                }
            }
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
    }
}
