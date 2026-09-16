class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs) {
            sb.append(str).append('~');
        }
        return new String(sb);
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0, j = 0;
        while(i < str.length()) {
            char ch = str.charAt(i);
            if(ch == '~') {
                String s = str.substring(j, i);
                res.add(s);
                j = i+1;
            }
            i++;
        }
        return res;
    }
}
