class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> hs = new HashSet<>();
        int i = 0;
        int max = 0;
        for(int j = 0; j < s.length(); j++) {
           char ch = s.charAt(j);

            while (hs.contains(ch)) {
                hs.remove(s.charAt(i));
                i++;
            }

            hs.add(ch);

            max = Math.max(max, j - i + 1);
        }
        return max;
    }
}
