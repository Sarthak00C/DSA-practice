class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> index = new HashMap<>();
        int res = 0, curr = 0;
        index.put(0, 1);
        for(int num : nums) {
            curr += num;
            int diff = curr - k;
            res += index.getOrDefault(diff, 0);
            index.put(curr, index.getOrDefault(curr, 0) + 1);
        }
        return res;
    }
}