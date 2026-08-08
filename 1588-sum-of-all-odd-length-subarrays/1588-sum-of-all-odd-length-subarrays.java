class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int[] sumarr = new int[arr.length];
        int presum = 0;
        int start = 0;
        int end = 0;
        int size = 1;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sumarr[i] = presum;
            presum = presum + arr[i];
        }

        while (size <= arr.length) {
            if (size == 1) {
                sum = sumarr[sumarr.length - 1] + arr[arr.length - 1];
            } else {
                start = 0;
                end = size-1;
                while (end < arr.length) {
                    int diff = sumarr[end] - sumarr[start] + arr[end];
                    sum += diff;
                    start++;
                    end++;
                }
            }
            size+=2;
        }

        return sum;

    }
}