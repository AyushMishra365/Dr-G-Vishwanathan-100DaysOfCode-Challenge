public class ThreeDivisors {
    public boolean isThree(int n) {
        int count=2;
        int i=n-1;
        while(i>1){
            if(n%i==0){
                count++;
            }
            i--;
        }
        if(count==3){
            return true;
        }
        return false;
    }

    //better optimised code
    // public boolean isThree(int n) {

    //     int count = 2; // 1 and n

    //     for (int i = 2; i * i <= n; i++) {

    //         if (n % i == 0) {
                                       //as divisors come in pairs like for 36, 2x18 both are divisors 
    //             if (i == n / i) {      //so checks if both divisors are eua; then just count once, eg for 36= 6x6 both are same 
    //                 count++;
    //             } else {        //else if both divisors are different count two divisors 
    //                 count += 2;
    //             }

    //             if (count > 3) {
    //                 return false;
    //             }
    //         }
    //     }

    //     return count == 3;
    // }
}
