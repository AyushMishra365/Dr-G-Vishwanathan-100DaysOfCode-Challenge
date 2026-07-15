public class PowerOfFour {

    //THIS IS USING MATHS POWER METHOD
//     public boolean isPowerOfFour(int n) {
        // for (int i = 0; i <= 15; i++) {       ---> Why i <= 15? Because: 4^15 = 1073741824 which is the largest power of 4 that fits in a 32-bit signed int.
//             int powerOfFour = (int) Math.pow(4, i);
//             if (powerOfFour == n)
//                 return true;
//             if (powerOfFour > n)
//                 return false;
//         }
//         return false;
//     }
// }

    //THIS IS ALSO THE SAME AS THE UPPER ONE BU TJUST BETTER BECAUSE Math.pow() is a fairly expensive library function because it works for any real numbers, not just integers.

//     public boolean isPowerOfFour(int n) {

//         int power = 1;

//         while (power <= n) {
//             if (power == n) {
//                 return true;
//             }

//             if (power > Integer.MAX_VALUE / 4) {
//                 break;
//             }

//             power *= 4;
//         }

//         return false;
//     }

    //THIS IS THE SIMPLEST YET THE CLEANEST SOLUTION FOR THIS PROBLEM BCZ IN THIS WE CAN ONLY GO AT MOST 15 ITERATIONS
    public boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 4 == 0) {
            n /= 4;
        }
        return n == 1;
    }
}


//BEST SOLUTION 
// class Solution {
//     public boolean isPowerOfFour(int n) {
//         return n > 0
//             && (n & (n - 1)) == 0
//             && (n & 0x55555555) != 0;    -->We use the mask 0x55555555 which in binary is 01010101010101010101010101010101. It has 1s only at the even bit positions.
//     }
// }