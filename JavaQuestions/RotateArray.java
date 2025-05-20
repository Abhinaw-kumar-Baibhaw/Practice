public class RotateArray {

    public static void rotate(int start, int end, int[] arr){
     while(start<=end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
     }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 4;
        k = k % arr.length;
        rotate(0,k-1,arr);
        rotate(k,arr.length-1,arr);
        rotate(0,arr.length-1,arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
