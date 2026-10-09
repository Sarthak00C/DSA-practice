class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int i = 0, j = arr.length - 1;
        while (j - i + 1 > k) {
            if (Math.abs(arr[i] - x) <= Math.abs(arr[j] - x)) {
                j--;
            } else {
                i++;
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int idx = i; idx <= j; idx++) {
            res.add(arr[idx]);
        }
        return res;
    }
}