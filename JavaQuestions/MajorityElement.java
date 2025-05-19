import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElement {
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> l = new ArrayList<>();
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!h.containsKey(nums[i])){
                h.put(nums[i],1);
            }
            else{
                h.put(nums[i],h.get(nums[i])+1);
            }
        }
        for(Integer key : h.keySet()){
            if(h.get(key)>(nums.length/3)){
                l.add(key);
            }
        }
        return l;
    }
    public static void main(String[] args) {
        int[] arr = {3,2,3};
        List<Integer> res = majorityElement(arr);
        System.out.println(res);

    }
}