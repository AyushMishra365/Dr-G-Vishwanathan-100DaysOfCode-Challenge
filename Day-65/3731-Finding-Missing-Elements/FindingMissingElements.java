import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class FindingMissingElements {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans= new ArrayList<>();
        Arrays.sort(nums);
        int i=nums[0];
        int index=0;
        while(index<nums.length){
            if(i==nums[index]){
                i++;
                index++;
            }
            else{
                ans.add(i);
                i++;
            }
        }
        return ans;
    }
}
