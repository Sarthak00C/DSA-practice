class Solution {
    public boolean validPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while(l < r) {
            if(s.charAt(l) != s.charAt(r)) {
               return isValid(l+1, r, s) || isValid(l, r - 1, s); 
            }
            l++;
            r--;
        }
        return true;
    }

    private boolean isValid(int l, int r, String s) {
        while(l < r) {
            if(s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}