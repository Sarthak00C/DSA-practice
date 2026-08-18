class Solution {
    public int subarraySum(int[] nums, int k) {
        int res = 0, curr = 0;
        Map<Integer, Integer> prefix = new HashMap<>();
        prefix.put(0, 1);

        for(int num : nums) {
            curr += num;
            int diff = curr - k;
            res += prefix.getOrDefault(diff, 0);
            prefix.put(curr, prefix.getOrDefault(curr, 0) + 1); 
        }

        return res;
    }
}