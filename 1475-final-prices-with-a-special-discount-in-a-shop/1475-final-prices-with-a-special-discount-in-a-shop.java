class Solution {
    public int[] finalPrices(int[] prices) {
        int[] res = new int[prices.length];
        Stack<Integer> s = new Stack<>();
        int i = 1;

        s.push(0);

        while ((!s.isEmpty()) && i < prices.length) {
            while ((!s.isEmpty()) && prices[s.peek()] >= prices[i]) {
                res[s.peek()] = prices[s.peek()] - prices[i];
                s.pop();
            }

            s.push(i++);
        }

        while (!s.isEmpty()) {
            int ind = s.pop();
            res[ind] = prices[ind];
        }

        return res;        
    }
}