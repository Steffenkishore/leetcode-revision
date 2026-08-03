import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[nums2.length];
        int[] res = new int[nums1.length];
        Stack<Integer> s = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        Arrays.fill(arr, -1);
        int i = 1;

        s.push(0);

        while ((!s.isEmpty()) && i < nums2.length) {

            while ((!s.isEmpty()) && nums2[s.peek()] < nums2[i]) {
                arr[s.peek()] = nums2[i];
                s.pop();
            }

            s.push(i);
            i++;
        }

        for (int k = 0; k < nums2.length; k++) {
            map.put(nums2[k], k);
        }

        for (int j = 0; j < nums1.length; j++) {
            int ind = map.get(nums1[j]);
            res[j] = arr[ind];
        }

        return res;

    }
}