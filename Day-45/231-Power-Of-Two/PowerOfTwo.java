//simple bitmanipulation twechnique , the sam ei sused in power of 4 questin(324) with a little add on
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}

//can comapre other solutions from leetcode 324 als 
// for (int i = 0; i <= 15; i++) {
//     if (Math.pow(4, i) == n)
//         return true;
// }

//the above Math pow method in easier way; this can also be compared with leetcode 324 solution
// class Solution {
//     public boolean isPowerOfTwo(int n) {

//         if (n <= 0)
//             return false;

//         int power = 1;

//         while (power <= n) {
//             if (power == n)
//                 return true;

//             if (power > Integer.MAX_VALUE / 2)
//                 break;

//             power *= 2;
//         }

//         return false;
//     }
// }