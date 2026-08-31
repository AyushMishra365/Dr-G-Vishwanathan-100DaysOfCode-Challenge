public class BinarySubarraysWithSum {
//VERY SLOW
    // public static int numSubarraysWithSum(int[] nums, int goal) {
    //     int count=0;
    //     int left=0;
    //     while(left<nums.length){
    //         int right=left;
    //         int sum=0;
    //         while(right<nums.length){
    //             sum+=nums[right];
    //             if(sum!=goal){
    //                 right++;
    //             }
    //             else{
    //                 count++;
    //                 break;
    //             }
    //         }
    //         right++;
    //         while(right<nums.length && sum==goal){
    //             sum+=nums[right];
    //             if(sum==goal){
    //                 count++;
    //             }
    //             right++;
    //         }
    //         left++;
    //     }
    //     return count;
    // }

    public static int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums,goal)-atMost(nums,goal-1);
    }
    public static int atMost(int[] nums, int goal){
        if(goal<0){
            return 0;
        }
        int left=0;
        int count=0;
        int sum=0;
        for (int right = 0; right < nums.length; right++) {
            sum+=nums[right];
            while(sum>goal){
                sum-=nums[left];
                left++;
            }
            count+=right-left+1;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1,0,1,0,1};
        int ans=numSubarraysWithSum(nums, 2);
        System.out.println(ans);
    }
}
