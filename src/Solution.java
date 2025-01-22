public class Solution {
    private boolean check(int[] weights , int days , int curr){
        int i =0;
        int currSum = 0;
        int currDays = 1;
        while(i < weights.length){
            currSum += weights[i];
            if(currSum > curr){
                currDays++;
                currSum = weights[i];
            }
            i++;
        }
        return currDays <= days;
    }

    public int minCapacity(int[] weights , int days){
        int left = 0, right = 0;
        int length = weights.length;
        for(int i = 0; i < length; i++){
            left = Math.max(left, weights[i]);
            right = right + weights[i];
        }
        int ans= right ;
        while(left <= right){
            int mid = left + (right - left)/ 2;
            if(check(weights , days , mid)){
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }
}
