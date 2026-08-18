class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> list = new ArrayList<>();

        int size = nums.length / 3;

        for(Integer k : map.keySet()) {
            if(map.get(k) > size) {
                list.add(k);
            }
        }

        return list;
    }
}