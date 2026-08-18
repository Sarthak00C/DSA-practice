class Solution {
    public int calPoints(String[] operations) {
        Stack<String> st = new Stack<>();
        int x = 0;
        for(int i = 0; i < operations.length; i++) {
            String str = operations[i];
            if(str.equals("C")) {
                st.pop();
            } else if (str.equals("D")) {
                int n = Integer.parseInt(st.peek());
                n *= 2;
                String s = String.valueOf(n);
                st.push(s);
            } else if (str.equals("+")) {
                int a = Integer.parseInt(st.pop());
                int b = Integer.parseInt(st.peek());
                st.push(String.valueOf(a));
                st.push(String.valueOf(a + b));
            } else {
                st.push(str);
            }
        }

        while(!st.isEmpty()) {
            int n = Integer.parseInt(st.pop());
            x += n;
        }

        return x;
    }
}