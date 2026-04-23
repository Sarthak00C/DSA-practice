class Solution {
    public String longestCommonPrefix(String[] strs) {
       int min = strs[0].length();
       int idx = 0;
       for(int i = 1; i < strs.length; i++) {
            if(min > strs[i].length()) {
                min = strs[i].length();
                idx = i;
            }
       }

       String s = strs[idx];

       for(int i = 0; i < s.length(); i++) {
          for(int j = 1; j < strs.length; j++) {
            if(strs[j].charAt(i) != s.charAt(i)) return s.substring(0, i);
          }
       }

       return s;

    }
}