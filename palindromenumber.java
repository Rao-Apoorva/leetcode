class Solution {
    public boolean isPalindrome(int x) {
        int temp = x, pal = 0;

        if (x < 0) {
            return false;
        }
        while (temp != 0) {
            int rev = temp % 10;
            pal = pal * 10 + rev;
            temp = temp / 10;
        }
        if (pal == x)
            return true;
        else
            return false;
    }
}