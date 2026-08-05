class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[i] * nums[i];
        }

        int ptr = 1;

        while (ptr < res.length) {
            int end = ptr;

            while (ptr > 0 && res[ptr-1] > res[ptr]) {
                int temp = res[ptr];
                res[ptr] = res[ptr-1];
                res[ptr-1] = temp;
                ptr--;
            }   
            ptr = end+1;         
        }

        return res;
        
    }
}