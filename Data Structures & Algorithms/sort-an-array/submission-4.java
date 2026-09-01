class Solution {
    public int[] sortArray(int[] arr) {
        Map<Integer, Integer> count = new HashMap<>();
        int min = arr[0], max = arr[0];
        
        for(int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
            count.put(arr[i], count.getOrDefault(arr[i], 0) + 1);
        }

        int idx = 0;
        for(int val = min; val <= max; ++val) {
            while(count.getOrDefault(val, 0) > 0) {
                arr[idx++] = val;
                count.put(val, count.get(val) - 1);
            } 
        }

        return arr;
    }
}