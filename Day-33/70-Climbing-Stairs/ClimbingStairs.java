public class ClimbingStairs {
    public int climbStairs(int n) {
    //well this is a fibonacci question so we can do it using recusrion very easilty but it won't be space optimized:
    // public int climbStairs(int n) {
    //     if (n == 0 || n == 1) {
    //         return 1;
    //     }
    //     return climbStairs(n-1) + climbStairs(n-2);
    // }

    // so that's why we can do it using dynamic programming and space optimization:
        if (n < 2) {
            return 1;
        }
        int prev = 1;
        int curr = 1;
        for (int i = 2; i <= n; i++) {
            int temp = curr;
            curr = prev + curr;
            prev = temp;
        }
        return curr;
    }

    //this was my original thought ; using combintorics , well the code is ai generated but the thought is mine and it works but the time complexity is O(n^2) and space complexity is O(1) so it's not optimal;
    //what i did is that any given number can be broken into 1+1+1+1.....+1 then two pairs of 1's can be replaced with 2's 
    // so for example if we have 5 then we can have 5 ones or 3 ones and 1 two or 1 one and 2 twos
    // so the number of ways to arrange them is nCr(n-twos, twos) where twos is the number of twos we have in the arrangement and n is the total number of steps so we can iterate over the number of twos from 0 to n/2 and sum up all the arrangements to get the total number of ways to climb the stairs;
    //public int climbStairs(int n) {
    //     int ways = 0;
    //     for (int twos = 0; twos <= n / 2; twos++) {
    //         int positions = n - twos;
    //         ways += nCr(positions, twos);
    //     }
    //     return ways;
    // }
    // public int nCr(int n, int r) {
    //     if (r > n) return 0;
    //     if (r > n - r) {
    //         r = n - r;
    //     }
    //     long result = 1;
    //     for (int i = 0; i < r; i++) {
    //         result = result * (n - i);
    //         result = result / (i + 1);
    //     }
    //     return (int) result;
    // }
}
