class Solution {
    public int removeDuplicates(int[] nums) {
        int idx = 0;
        Set<Integer> hs = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if(hs.contains(nums[i])) {
                continue;
            } else {
                nums[idx++] = nums[i];
                hs.add(nums[i]);
            }
        }
        return idx;
    }
}