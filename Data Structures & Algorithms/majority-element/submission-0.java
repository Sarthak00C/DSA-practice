class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();

        int k = nums.length / 2;

        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> c : count.entrySet()) {
            if (c.getValue() > k) {
                return c.getKey();
            }
        }

        return -1;
    }
}