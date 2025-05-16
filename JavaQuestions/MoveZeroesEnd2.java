public class MoveZeroesEnd2 {
     public static void moveZeroes(int[] nums) {
        int j = 0;
        int i = 0;
        while(j<nums.length){
            if(nums[j]!=0){
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j] = temp;
                j++;
                i++;
            }
            else{
                j++;
            }
        }
        for(int k=0;k<nums.length;k++){
            System.out.print(nums[k]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);    }
}
