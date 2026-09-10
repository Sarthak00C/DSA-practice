class Solution {
    public int[] sortArray(int[] nums) {
        Map<Integer, Integer> cnt = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num : nums) {
            cnt.put(num, cnt.getOrDefault(num, 0) + 1);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        int idx = 0;
        for(int i = min; i <= max; i++) {
            if(cnt.containsKey(i)) {
                while(cnt.get(i) > 0) {
                    nums[idx++] = i;
                    cnt.put(i, cnt.getOrDefault(i, 0) - 1);
                }
            }
        }
        return nums;
    }
}