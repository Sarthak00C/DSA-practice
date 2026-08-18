class Solution {
    public int subarraySum(int[] nums, int k) {
       int res = 0, curr = 0;
       Map<Integer, Integer> map = new HashMap<>();
       map.put(0, 1);

       for(int num : nums) {
        curr += num;
        int diff = curr - k;
        res += map.getOrDefault(diff, 0);
        map.put(curr, map.getOrDefault(curr, 0) + 1);
       }

       return res;
    }
}