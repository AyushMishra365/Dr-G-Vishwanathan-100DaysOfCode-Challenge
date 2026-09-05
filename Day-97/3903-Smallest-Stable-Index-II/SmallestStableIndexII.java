public class SmallestStableIndexII {
    public int firstStableIndex(int[] nums, int k) {
        int[] suffixMin=new int[nums.length];
        suffixMin[nums.length-1]=nums[nums.length-1];
        for (int i = nums.length-2; i >=0; i--) {
            suffixMin[i]=Math.min(nums[i],suffixMin[i+1]);
        }
        int max=Integer.MIN_VALUE;
        for (int j = 0; j < nums.length; j++) {
            max=Math.max(max,nums[j]);
            if(max-suffixMin[j]<=k){
                return j;
            }
        }
        return -1;
    }
    
}
