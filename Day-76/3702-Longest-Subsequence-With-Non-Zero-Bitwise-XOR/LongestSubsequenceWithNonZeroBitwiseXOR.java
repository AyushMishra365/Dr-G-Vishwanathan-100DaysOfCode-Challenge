public class LongestSubsequenceWithNonZeroBitwiseXOR {
    public static  int longestSubsequence(int[] nums) {
        int i=0;
        int ans=0;
        while(i<nums.length){
            ans=ans^nums[i];
            i++;
        }
        if(ans!=0){
            return nums.length;
        }
        else{
            for(int j=0; j<nums.length;j++){
                int value=nums[j];
                if(value!=0){
                    return nums.length-1;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3};
        int res = longestSubsequence(nums);
        System.out.println(res);
    }
}
