public class SmallestStableIndexI {
    public static int firstStableIndex(int[] nums, int k) {
    //SLOWER- O(n^2)
        // int[] arr=new int[nums.length];
        // for (int i = 0; i < nums.length; i++) {
        //     int max=nums[i];
        //     int min=nums[i];
        //     int a=0; int b=i;
        //     while(a<=i){
        //         max=Math.max(nums[a],max);
        //         a++;
        //     }
        //     while(b<nums.length){
        //         min=Math.min(nums[b],min);
        //         b++;
        //     }
        //     arr[i]=max-min;
        // }
        // for (int i = 0; i < arr.length; i++) {
        //     if(arr[i]<=k){
        //         return i;
        //     }
        // }
        // return -1;

    //FASTER- O(n)
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
    public static void main(String[] args) {
        int[] nums={5,0,1,4};
        int k=3;
        int ans=firstStableIndex(nums, k);
        System.out.println(ans);
    }
}
