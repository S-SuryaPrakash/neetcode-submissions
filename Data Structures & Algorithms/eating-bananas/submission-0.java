class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high =0;
        for(int num:piles){
            high = Math.max(high, num);
        }
        while(low<=high){
            int sum=0;
            int mid = low + (high-low)/2;
            for(int num:piles){
                sum+=(num+mid-1)/mid;
                if(sum>h) break;
            }
            if(sum>h) low = mid+1;
            else high = mid-1; 
        }
        return low;
    }
}