class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        int max = Integer.MIN_VALUE;
        for(int num : nums) {
            if(num > 0) {
                hs.add(num);
                max = Math.max(max, num);
            }
        }
        if(max < 1) return 1;
        for(int i = 1; i <= max; i++) {
            if(!hs.contains(i)) {
                return i;
            }
        }

        return max+1;
    }
}