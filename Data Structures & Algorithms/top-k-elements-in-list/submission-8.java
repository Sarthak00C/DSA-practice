class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int[] ans = new int[k];

        Map<Integer, Integer> freq = new HashMap<>();

        for(int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // +1 because frequency can be nums.length
        List<Integer>[] freqArr =
            (List<Integer>[]) new List[nums.length + 1];

        for(int i = 0; i < freqArr.length; i++) {
            freqArr[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer, Integer> val : freq.entrySet()) {
            freqArr[val.getValue()].add(val.getKey());
        }

        int index = 0;

        for(int i = nums.length; i >= 0; i--) {

            if(k == 0) break;

            if(freqArr[i].size() > 0) {

                int j = 0;

                while(j < freqArr[i].size() && k > 0) {
                    ans[index++] = freqArr[i].get(j);
                    k--;
                    j++;
                }
            }
        }

        return ans;
    }
}