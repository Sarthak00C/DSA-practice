class Solution {
    public String decodeString(String s) {
            Stack<Integer> st = new Stack<Integer>();
            Stack<String> stS = new Stack<String>();
            StringBuilder cur = new  StringBuilder();
            int k = 0;

            for(char c : s.toCharArray()) {
                if(Character.isDigit(c)) {
                    k = k * 10 + (c - '0');
                } else if (c == '[') {
                    stS.push(cur.toString());
                    st.push(k);
                    cur = new StringBuilder();
                    k = 0;
                } else if (c == ']') {
                    String temp = cur.toString();
                    cur = new StringBuilder(stS.pop());
                    int count = st.pop();
                    for(int i = 0; i < count; i++) {
                        cur.append(temp);
                    }
                } else {
                    cur.append(c);
                }
            }

            return cur.toString();
    }
}