class Solution {
    private void reverse(StringBuilder newStr, int start, int end) {
        int p1 = start;
        int p2 = end;

        while (p1 < p2) {
            char temp = newStr.charAt(p1);
            newStr.setCharAt(p1, newStr.charAt(p2));
            newStr.setCharAt(p2, temp);

            p1++;
            p2--;
        }
    }

    public String reverseStr(String s, int k) {
        int len = s.length();
        int start = 0;

        StringBuilder newStr = new StringBuilder(s);

        while (start + 2 * k <= len) {
            reverse(newStr, start, start + k - 1);
            start += 2 * k;
        }

        int remaining = len - start;

        if (remaining < k) {
            reverse(newStr, start, len - 1);
        } else {
            reverse(newStr, start, start + k - 1);
        }

        return newStr.toString();
    }
}
