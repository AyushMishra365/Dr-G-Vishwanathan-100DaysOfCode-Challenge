import java.util.ArrayList;
public class DistributeElementsIntoTwoArraysI {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> result1= new ArrayList<>();
        ArrayList<Integer> result2= new ArrayList<>();
        result1.add(nums[0]);
        result2.add(nums[1]);
        for(int i=2;i<nums.length;i++){
            int last1=result1.get(result1.size()-1);
            int last2= result2.get(result2.size()-1);
            if(last1>last2){
                result1.add(nums[i]);
            }
            else result2.add(nums[i]);
        }
        int[] ans=new int[nums.length];
        int index=0;
        for(int i=0;i<result1.size();i++){
            ans[index]=result1.get(i);
            index++;
        }
        for(int i=0;i<result2.size();i++){
            ans[index]=result2.get(i);
            index++;
        }
        return ans;
    }
}
