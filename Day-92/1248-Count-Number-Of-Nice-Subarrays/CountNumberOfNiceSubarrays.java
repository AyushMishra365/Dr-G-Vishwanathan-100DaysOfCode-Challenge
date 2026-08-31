public class CountNumberOfNiceSubarrays {
//This questionn has the exact solution as Leetcode 930:
//I have solved that question on the smae day as this check it out.
//Only thing i did here is that i chnaged all even numbers to 0 an dall odd numbers to 1. 
//and as the question asked about subarrays with given number of odd numbers , this question became exact like Leetode 930
//where we had to gather subarrays with sum equal to a target sum . So all the odd values summed up give subarray.|
//This question became exact like that Leetcode 930 now.
    public int numberOfSubarrays(int[] nums, int k) {
        for(int i=0; i<nums.length;i++){
            if(nums[i]%2==0){
                nums[i]=0;
            }
            else{
                nums[i]=1;
            }
        }
        return atMost(nums,k)-atMost(nums,k-1);
    }
    public static int atMost(int[] nums, int k){
        if(k<0){
            return 0;
        }
        int left=0;
        int count=0;
        int sum=0;
        for (int right = 0; right < nums.length; right++) {
            sum+=nums[right];
            while(sum>k){
                sum-=nums[left];
                left++;
            }
            count+=right-left+1;
        }
        return count;
    }
}
