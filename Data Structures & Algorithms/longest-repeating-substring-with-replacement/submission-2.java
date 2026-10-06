class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> freq = new HashMap<>();
        int i = 0, maxf = 0, res = 0;
        for(int j = 0; j < s.length(); j++) {
            freq.put(s.charAt(j), freq.getOrDefault(s.charAt(j), 0) + 1);
            maxf = Math.max(maxf, freq.get(s.charAt(j)));

            while((j - i + 1) - maxf > k) {
                freq.put(s.charAt(i), freq.get(s.charAt(i)) - 1);
                i++;
            }

            res = Math.max(res, j - i + 1);
        }

        return res;
    }
}
