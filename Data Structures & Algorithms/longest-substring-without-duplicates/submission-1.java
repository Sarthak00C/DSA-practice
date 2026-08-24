class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();

        int max = 0;
        int l = 0;

        for (int r = 0; r < s.length(); r++) {
            char ch = s.charAt(r);

            while (hs.contains(ch)) {
                hs.remove(s.charAt(l));
                l++;
            }

            hs.add(ch);

            max = Math.max(max, r - l + 1);
        }

        return max;
    }
}
