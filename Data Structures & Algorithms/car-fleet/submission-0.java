class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = speed.length;
        int[][] pairs = new int[n][2];
        for(int i=0;i<n;i++){
            pairs[i][0] = position[i];
            pairs[i][1] = speed[i];
        }
        Arrays.sort(pairs,(a,b)->Integer.compare(b[0],a[0]));
        Stack<Double> st = new Stack<>();
        for(int[] tt : pairs){
            int pos = tt[0];
            int spd = tt[1];
            Double timeTaken = (double)(target-pos)/spd;
            if(st.isEmpty() || st.peek()<timeTaken){
                st.push(timeTaken);
            }
        }
        return st.size();
    }
}