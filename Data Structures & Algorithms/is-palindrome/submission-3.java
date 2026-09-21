class Solution {
    public boolean isPalindrome(String s) {
        String sb = "";
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if((ch >= 'a' && ch <= 'z') || 
            (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')) {
                String str = String.valueOf(Character.toLowerCase(ch));
                sb += str;
            }
        }

        int l = 0;
        int r = sb.length() - 1;
        while(l < r) {
            if(sb.charAt(l) != sb.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
