class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Prefix sum 0 has occurred once
        map.put(0, 1);

        int prefixSum = 0;
        int subarrays = 0;

        for (int num : nums) {

            prefixSum += num;

            int required = prefixSum - k;

            if (map.containsKey(required)) {
                subarrays += map.get(required);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return subarrays;
    }
}