public class RemovingMinimumAndMaximumFromArray {
    public int minimumDeletions(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        int min=0;
        int max=0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]<nums[min]){
                min=i;
            }
            else if(nums[i]>nums[max]){
                max=i;
            }
        }
        int mov1=0; int mov2=0;; int mov3=0;
        if(min<max){
            mov1=Math.max(min,max)+1;
            mov2=nums.length-Math.min(min,max);
            mov3=(min+(nums.length-max))+1;
        }
        else if(max<min){
            mov1=Math.max(min,max)+1;
            mov2=nums.length-Math.min(min,max);
            mov3=(max+(nums.length-min))+1;
        }
        return Math.min(mov1,(Math.min(mov2,mov3)));
    }
}
