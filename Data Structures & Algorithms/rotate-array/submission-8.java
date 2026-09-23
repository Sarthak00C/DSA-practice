class Solution {
    public void rotate(int[] nums, int k) {
        if(k > nums.length) k %= nums.length;
        int l = nums.length - k;
        int r = nums.length - 1;
        while(l < r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
        l = 0;
        r = nums.length - k - 1;
        while(l < r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
        l = 0;
        r = nums.length - 1;
        while(l < r) {
           int temp = nums[l];
           nums[l] = nums[r];
           nums[r] = temp;
           l++;
           r--; 
        }
    }
}