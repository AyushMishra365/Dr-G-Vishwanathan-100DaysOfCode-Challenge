import java.util.Arrays;
public class FindGreatestCommonDivisorOfArray {
    // public int findGCD(int[] nums) {
    //     Arrays.sort(nums);
    //     int min=nums[0];
    //     int max=nums[nums.length-1];
    //     int maxNum=0;
    //     for(int i=1; i<=min;i++){
    //         if(min%i==0 && max%i==0){
    //             if(i>=maxNum){
    //                 maxNum=i;
    //             }
    //         }
            
    //     }
    //     return maxNum;
    // }

    public int findGCD(int[] nums) {
        int mn = nums[0];
        int mx = nums[0];
        for (int num : nums) {
            mn = Math.min(mn, num);
            mx = Math.max(mx, num);
        }
        return gcd(mn, mx);
    }
    public int gcd(int a, int b) {
        int maxNum = 0;
        for (int j = 1; j <= a; j++) {
            if (a % j == 0 && b % j == 0) {
                maxNum = j;
            }
        }
        return maxNum;
    }
}
