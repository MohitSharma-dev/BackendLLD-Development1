package StreamsAndLambdas;

import java.util.Arrays;

public class Solution2 {
    private int[][] dp;
    private int[] slots;

    private int checkIfSlotAvailableHelper(int noOfSlots , int remainingTime){
//        Base conditions
        if(remainingTime == 0){
            return 1;
        }
        if(noOfSlots == 0){
            return 0;
        }

        if(dp[noOfSlots][remainingTime] != -1){
            return dp[noOfSlots][remainingTime];
        }

        dp[noOfSlots][remainingTime] = checkIfSlotAvailableHelper(noOfSlots - 1, remainingTime) |
                checkIfSlotAvailableHelper(noOfSlots - 1, remainingTime - slots[noOfSlots - 1]);
        return dp[noOfSlots][remainingTime];
    }

    public boolean checkIfSlotAvailable(int[] slots , int requestedTime){
        int noOfSlots = slots.length;
        this.slots = slots;
        dp = new int[noOfSlots + 1][requestedTime + 1];
        for(int i = 0 ; i < noOfSlots; i++){
            Arrays.fill(dp[i], -1);
        }
        return checkIfSlotAvailableHelper(noOfSlots , requestedTime) == 1;
    }

}
