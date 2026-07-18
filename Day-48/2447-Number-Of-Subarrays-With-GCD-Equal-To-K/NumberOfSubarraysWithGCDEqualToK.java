public class NumberOfSubarraysWithGCDEqualToK {
    public int subarrayGCD(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int currentGCD = nums[i];
            for (int j = i; j < nums.length; j++) {
                currentGCD = gcd(currentGCD, nums[j]);
                if (currentGCD == k) {
                    count++;
                }
                if (currentGCD < k) {
                    break;
                }
            }
        }
        return count;
    }
    public int gcd(int a, int b) {
        int min = Math.min(a, b);
        int ans = 1;
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                ans = i;
            }
        }
        return ans;
    }

    //this gcd could also be done through euclidean's algorithm --> this is faster than above gcd method
    // public int gcd(int a, int b) {

    //     while (b != 0) {
    //         int temp = b;
    //         b = a % b;
    //         a = temp;
    //     }

    //     return a;
    // }
}
