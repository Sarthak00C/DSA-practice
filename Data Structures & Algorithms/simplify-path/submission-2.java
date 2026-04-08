class Solution {
    public String simplifyPath(String path) {
        String[] paths = path.split("/");
        Stack<String> st = new Stack<String>();
        for(int i = 0; i < paths.length; i++) {
            if(paths[i].equals("..")) {
                if(!st.isEmpty()) {
                    st.pop();
                }
            } else if (!paths[i].equals("") && !paths[i].equals(".")) {
                st.push(paths[i]);
            }
        }

        return "/" + String.join("/", st);
    }
}