class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int res = 0;

        int child = 0;
        int cookie = 0;

        while (cookie < s.length && child < g.length) {
            if (s[cookie] >= g[child]) {
                res++;
                cookie++;
                child++;
            } else {
                cookie++;
            }
        }

        return res;
    }
}