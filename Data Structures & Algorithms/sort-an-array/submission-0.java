class Solution {
    public int[] sortArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);

        int idx = 0;
        for(int key : keys) {
            int freq = map.get(key);
            while(freq-- > 0) {
                nums[idx++] = key;
            }
        }

        return nums;
    }
}