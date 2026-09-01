class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> count = new HashMap<>();
        for(String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String str = new String(arr);
            count.putIfAbsent(str, new ArrayList<>());
            count.get(str).add(s);
        }

        return new ArrayList<>(count.values());
    }
}
