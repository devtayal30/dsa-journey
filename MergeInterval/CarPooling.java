class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] stops = new int[1001];

        for(int[] trip : trips){
            int num = trip[0];
            int from = trip[1];
            int to = trip[2];

            stops[from] += num;

            stops[to] -= num;
        }

        int current = 0;
        for(int i=0 ; i<1001; i++){
            current += stops[i];

            if(current > capacity)
            return false;
        }
        return true;
    }
}