class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int curr = 0;
        int i = 0;
        for(int j = 0; j < nums.length; j++) {
            curr += nums[j];
            while(curr >= target) {
                min = Math.min(min, j - i + 1);
                curr -= nums[i];
                i++;
            }
        }
        return min == Integer.MAX_VALUE? 0 : min;
    }
}