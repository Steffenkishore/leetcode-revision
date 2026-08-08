import java.util.*;

class Solution {
    public int largestAltitude(int[] gain) {
        int[] arr = new int[gain.length];
        int max = 0;
        int presum = 0;

        for (int i = 0; i < gain.length; i++) {
            arr[i] = presum + gain[i];
            presum = presum + gain[i];
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;

    }
}