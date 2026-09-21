class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0, j = 0;
        String ans = "";
        while(i < word1.length() && j < word2.length()) {
            ans += String.valueOf(word1.charAt(i++));
            ans += String.valueOf(word2.charAt(j++));
        }

        while(i < word1.length()) {
            ans += String.valueOf(word1.charAt(i++));
        }

        while(j < word2.length()) {
            ans += String.valueOf(word2.charAt(j++));
        }

        return ans;
    }
}