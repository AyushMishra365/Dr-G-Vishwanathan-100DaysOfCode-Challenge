import java.util.ArrayList;
public class HappyNumber {
    public boolean isHappy(int n) {
        while (n > 810) {
            n = squareSum(n);
        }
        boolean[] seen = new boolean[811];
        while (n != 1) {
            if (seen[n]) {
                return false;
            }
            seen[n] = true;
            n = squareSum(n);
        }
        return true;
    }
    public int squareSum(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
//         ArrayList<Integer> seen= new ArrayList<>();
//         while(n!=1){
//             if(seen.contains(n)){
//                 return false;
//             }
//             seen.add(n);
//             n=squareSum(n);
//         }
//         return true;
// }
//     public int squareSum(int n) {
    //     int sum = 0;
    //     while (n > 0) {
    //         int digit = n % 10;
    //         sum += digit * digit;
    //         n /= 10;
    //     }
    //     return sum;
//     }
}
