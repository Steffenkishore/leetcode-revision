import java.util.*;

class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (!(set.contains(nums[i]))) {
                arr.add(nums[i]);
                set.add(nums[i]);
            }
        }

        Collections.sort(arr, Collections.reverseOrder());

        if (arr.size() < 3) {
            return arr.get(0);
        }
        
        return arr.get(2);
        
    }
}