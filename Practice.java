import java.util.Arrays;

public class Practice {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                end = mid-1;   
            }
            else{
               start = mid+1; 
            }
        }
        return -1;
    }

    public int[] getFloorAndCeil(int x, int[] arr) {
      Arrays.sort(arr);
      int floor=-1,ceil=-1;

      for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= x) {
                floor = arr[i];
            }
        }
        
     for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] >= x) {
                ceil = arr[i];
            }
        }
      return new int[]{floor,ceil};
      
    }

    public int searchInsert() {
        int nums[] = {1,3,5,6};
        int target = 5;
        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = start + (end-start)/2;
            if (nums[mid] == target){
                return mid;
            }
            else if (nums[mid] > target){
                 end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }


    public int[] searchRange() {

        int nums[] = {5,7,7,8,8,10};
        int target = 8;

        int arr[]=new int[2];
        Arrays.sort(nums);
        if(nums.length==0) return new int[]{-1,-1};
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                 arr[0]=i;
                 break;
            }
            if(i==nums.length-1&&nums[i]!=target)
            {
                 arr[0]=-1;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==target){
                 arr[1]=i;
                 break;
            }
             if(i==nums.length-1&&nums[i]!=target)
            {
                 arr[1]=-1;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Practice b = new Practice();
       int nums[] = {-1,0,3,5,9,12};
       int target = 9;
     int res =  b.search(nums, target);
     System.out.println(res);

     int arr[] = {5, 6, 8, 9, 6, 5, 5, 6};
     int x = 7;


    int[] arr1 = b.getFloorAndCeil(x, arr);
    System.out.println(Arrays.toString(arr1));

    int res1 = b.searchInsert();  
    System.out.println(res1);  

    int[] res2 = b.searchRange();
    System.out.println(Arrays.toString(res2));




}
}
