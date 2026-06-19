public class FindNumberWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        //comparatively slower
        // int count = 0;
        // for(int i=0; i<nums.length; i++){
        //     int length=String.valueOf(nums[i]).length();
        //     if(length %2==0){
        //         count++;
        //     }
        // }
        // return count;

        int count=0;
        for(int i=0; i<nums.length; i++){
            int length=digits(nums[i]);
            if(length%2==0){
                count++;
            }
        }
        return count;
    }
    public int digits(int n) {
        int count = 0;
        while(n > 0) {
            count++;
            n /= 10;
        }
        return count;

    //another fast method
        // int count = 0;
        // for(int i = 0;i<nums.length;i++){
        //     if((nums[i]>=10 && nums[i]<=99) || (nums[i]>=1000 && nums[i]<=9999) || (nums[i] == 100000)){
        //         count++;
        //     }
        // }
        // return count;
}
}
