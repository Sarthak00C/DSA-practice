class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> ans = new ArrayList<>();
        int k = nums.length / 3;
        for(Map.Entry<Integer, Integer> key : map.entrySet()) {
            int n = key.getValue();
            if(n > k) {
                ans.add(key.getKey());
            }
        }
        return ans;
    }
}