class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs) {
            char[] s = str.toCharArray();
            Arrays.sort(s);
            String S = new String(s);
            if(map.containsKey(S)) {
                map.get(S).add(str);
            } else {
                map.put(S, new ArrayList<>());
                map.get(S).add(str);
            }
        } 

        return new ArrayList<>(map.values());
    }
}
