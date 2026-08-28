public class SumOfAbsoluteDifferencesInASortedArray {
    public static int[] getSumAbsoluteDifferences(int[] nums) {
        int[] result= new int[nums.length];
        int totalSum=0;
        for(int num: nums){
            totalSum+=num;
        }
        int lessSum=0;
        for (int i = 0; i < nums.length; i++) {
            int moreSum=totalSum-lessSum-nums[i];
            int leftSum=nums[i]*i-lessSum;
            int rightSum=moreSum-nums[i]*(nums.length-1-i);
            result[i]=leftSum+rightSum;
            lessSum+=nums[i];
        }
        return result;
    }
//TLE BUT LOGIC IS PERFECT, only problem is i m still using j in loop

    // public static int[] getSumAbsoluteDifferences(int[] nums) {
    //     int[] result = new int[nums.length];
    //     for (int i = 0; i < nums.length; i++) {
    //         int lessSum=0; int moreSum=0;
    //         for (int j = 0; j < result.length; j++) {
    //             if(j<i){
    //                 lessSum+=nums[j];
    //             }
    //             else if(j>i){
    //                 moreSum+=nums[j];
    //             }
    //         }
    //         int leftSum=nums[i]*i-lessSum;
    //         int rightSum=moreSum-nums[i]*(nums.length-1-i);
    //         result[i]=leftSum+rightSum;
    //     }
    //     return result;
    // }
//Obviosuly this brute force is TLE code. 

    // public static int[] getSumAbsoluteDifferences(int[] nums) {
    //     int[] result= new int[nums.length];
    //     for (int i = 0; i < nums.length; i++) {
    //         for (int j = 0; j < nums.length; j++) {
    //             result[i]+=Math.max(nums[i],nums[j])-Math.min(nums[i],nums[j]); //or Math.abs(nums[i]-nums[j])
    //         }
    //     }
    //     return result;
    // }
    public static void main(String[] args) {
        int[] nums = {2,3,5};
        int[] result =getSumAbsoluteDifferences(nums);
        System.out.println(result);
    }
}
