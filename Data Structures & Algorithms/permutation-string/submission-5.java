class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        Map<Character, Integer> freq1 = new HashMap<>();
        for(int i = 0; i < s1.length(); i++) {
            freq1.put(s1.charAt(i), freq1.getOrDefault(s1.charAt(i), 0) + 1);
        }
        int k = s1.length();
        int i = 0;
        Map<Character, Integer> window = new HashMap<>();
        for(int j = 0; j < s2.length(); j++) {
            char ch = s2.charAt(j);
            window.put(ch , window.getOrDefault(ch, 0) + 1);
            if(j - i + 1 == k) {
                if(freq1.equals(window)) {
                    return true;
                }

                char left = s2.charAt(i);
                window.put(left, window.getOrDefault(left, 0) - 1);

                if(window.get(left) == 0) {
                    window.remove(left);
                }

                i++;
            }
        }

        return false;
        
    }
}
