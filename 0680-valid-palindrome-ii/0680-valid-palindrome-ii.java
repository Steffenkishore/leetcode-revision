class Solution {
    public boolean validPalindrome(String s) {
        int p1 = 0;
        int p2 = s.length() - 1;

        while (p1 < p2) {
            if (s.charAt(p1) != s.charAt(p2)) {
                return isPalindrome(s, p1 + 1, p2) ||
                       isPalindrome(s, p1, p2 - 1);
            }

            p1++;
            p2--;
        }

        return true;
    }

    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
