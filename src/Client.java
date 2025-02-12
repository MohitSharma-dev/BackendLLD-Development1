// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;

class Main {
    public static void main(String[] args) {
        System.out.println(getMoves(37882).size());
    }

    private static List<Integer> getMoves(int n){
        if(n == 0){
            return List.of(0);
        }

        if(n <= 9){
            return List.of(n , 0);
        }

        int[] dp = new int[n + 1];
        dp[0] = 0 ;
        for(int i = 1;i <= 9; i++){
            dp[i] = 1;
        }

        for(int i = 10; i <= n; i++){
            int minMoves = 10000001;
            int curr = i;
            while(curr != 0){
                int digit = curr % 10;
                curr = curr / 10;
                if(digit != 0)
                minMoves = Math.min(minMoves , dp[i - digit]);
            }
            dp[i] = 1 + minMoves;
        }

        List<Integer> result = new ArrayList<>();

        result.add(n);

        for(int i = 0; i <=n ;i++){
//            System.out.print(dp[i] + " ");
        }
        System.out.println(dp[20] + " " + dp[18]);
        while(n != 0){
            int curr = n;
//            System.out.println(n);
            while(curr !=0 ){
                int digit = curr % 10;
                curr = curr / 10;
//                System.out.println(n - digit + " " + digit + " " + n);
                if(digit !=0 && dp[n - digit] + 1 == dp[n]){
//                    System.out.println(n - digit);
                    result.add(n - digit);
                    n = n - digit;
                    break;
                }
            }
        }

        return result;













    }
}
