class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> hs = new HashSet<>();
        int l = 0;  
        for(int r = 0; r < nums.length; r++) {
            if(hs.contains(nums[r])) {
                while(nums[l] != nums[r]) {
                    l++;
                }
                if(Math.abs(r - l) <= k) {
                    return true;
                } else {
                    l++;
                }
            } 
            hs.add(nums[r]);
        }
        return false;
    }
}