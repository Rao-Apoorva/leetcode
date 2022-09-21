class Solution {
    public String reverseVowels(String s) {
        int i = 0, j = s.length() - 1;
        char charr[] = s.toCharArray();
        while (i < j) {
            if (vowelLetters(charr[i]) && vowelLetters(charr[j])) {
                char temp = charr[i];
                charr[i] = charr[j];
                charr[j] = temp;
                i++;
                j--;
            } else if (!vowelLetters(charr[i])) {
                i++;
            } else if (!vowelLetters(charr[j])) {
                j--;
            }
        }
        return new String(charr);
    }

    public boolean vowelLetters(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                || c == 'U');
    }
}