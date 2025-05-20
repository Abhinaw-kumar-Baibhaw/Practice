import java.util.HashSet;

public class Union {
    public static Integer[] unionArray(int[] nums1, int[] nums2) {
               HashSet<Integer> h = new HashSet<>();
               for(int num : nums1){
                    h.add(num);
               }
               for(int num : nums2){
                h.add(num);
               }
             return h.toArray(new Integer[0]);
    }
    public static void main(String[] args) {
        int[]  nums1 = {1, 2, 3, 4, 5};
        int[]  nums2 = {1, 2, 7};
        Integer[] res = unionArray(nums1,nums2);
        for(Integer result : res){
            System.out.print(result+" ");
        }
    }
}