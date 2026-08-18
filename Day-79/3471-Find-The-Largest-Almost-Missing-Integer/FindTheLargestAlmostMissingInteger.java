import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class FindTheLargestAlmostMissingInteger {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        if(k==n){
            int maxValue= nums[0];
            for(int num: nums){
                maxValue=Math.max(maxValue,num);
            }
            return maxValue;
        }
        List<Integer> arr= new ArrayList<>();
        if(k==1){
            for(int x:nums){
                int count=0;
                for(int y:nums){
                    if(x==y){
                        count++;
                    }
                }
                if(count==1){
                arr.add(x);
                }
            }
        }
        else{
            int[] candidates={nums[0],nums[n-1]};
            for(int x:candidates){
                int count=0;
                for(int y:nums){
                    if(x==y){
                        count++;
                    }
                }
                if(count==1){
                    arr.add(x);
                }
            }
        }
        if(arr.isEmpty()){
            return -1;
        }
        return Collections.max(arr);
    }
}
