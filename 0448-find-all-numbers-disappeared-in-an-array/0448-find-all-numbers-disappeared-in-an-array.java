import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] arr = new int[nums.length];
        ArrayList<Integer> res = new ArrayList<>();

        Arrays.fill(arr, 0);

        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]-1] = nums[i];
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == 0) {
                res.add(j+1);
            }
        }

        return res;
        
    }
}