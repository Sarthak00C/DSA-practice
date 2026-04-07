class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int[] res = new int[temp.length];
        int idx = 0;
        for(int i = 0; i < temp.length; i++) {
            int count = 0;
            int n = 0;
            for(int j = i + 1; j < temp.length; j++) {
                count++;
                if(temp[j] > temp[i]) {
                    n = count;
                    break;
                }
            }
            res[idx++] = n;
        }

        return res;
    }
}
