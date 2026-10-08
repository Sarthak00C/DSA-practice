class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> freq = new HashMap<>();
        int maxf = 0;
        int i = 0;
        int max = Integer.MIN_VALUE;
        for(int j = 0; j < s.length(); j++) {
            freq.put(s.charAt(j), freq.getOrDefault(s.charAt(j), 0) + 1);
            maxf = Math.max(maxf, freq.get(s.charAt(j)));
            while(j - i + 1 - maxf > k) {
                freq.put(s.charAt(i), freq.getOrDefault(s.charAt(i), 0) - 1);
                i++;
            }
            max = Math.max(max, j - i + 1);
        }
        return max;
    }
}
