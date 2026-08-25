import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class SmallestMissingMultipleOfK {
//THIS IS ALSO A ANSWER BUT THIS CANNOT DEAL WITH DUPLICATES
    // public static int missingMultiple(int[] nums, int k) {
    //     int[] arr=new int[nums.length];
    //     int index=0; 
    //     Arrays.sort(nums);
    //     for (int i = 0; i < nums.length; i++) {
    //         if(nums[i]%k==0){
    //             arr[index]=nums[i]/k;
    //             index++;
    //         }
    //     }
    //     Arrays.sort(arr,0,index);  //this is because arr is of nums.length which creates more indexes in arr than we need to fill for many examlples, also for the given one.
    //     //so we only sort those parts that we filled in arr;
    //     for (int i = 0; i < index; i++) { //similarly we check onyl those parts that we filled
    //         if(arr[i]!=i+1){
    //             return (i+1)*k;
    //         }
    //     }
    //     return (index+1)*k;
    // }
    // public static void main(String[] args) {
    //     int[] nums={8,2,3,4,6};
    //     int k=2;
    //     int ans=missingMultiple(nums, k);
    //     System.out.println(ans);
    // }

//THIS DEALS  WITH DUPLICATES BY CHECKING WHAT WE EXPECT NEXT BUT IGNORE IT, IF IT IS A DUPLICATE
//BUT THIS IS NOT A GOOD SOLUTION BCZ IT IS SLOW AS WE ARE CREATING AN EXTRA ARRAY AND CHECKING EACH ELEMENT
    // public int missingMultiple(int[] nums, int k) {
    //     int[] arr=new int[nums.length];
    //     int index=0; 
    //     Arrays.sort(nums);
    //     for (int i = 0; i < nums.length; i++) {
    //         if(nums[i]%k==0){
    //             arr[index]=nums[i]/k;
    //             index++;
    //         }
    //     }
    //     Arrays.sort(arr,0,index);  
    //     int expected=1;
    //     for (int i = 0; i < index; i++) {
    //         if(arr[i]<expected){
    //             continue;
    //         }
    //         if(arr[i]==expected){
    //             expected++;
    //         }
    //         else return expected*k;
    //     }
    //     return expected*k;
    // }

//THERE IS A FASTER SOLUTION TO THIS USING SETS: sets only STORE UNIQUE VALUES so we don't need an extra condition for checking duplicates
//UING SETS IS PERFECT FOR THIS QUESTION BECAUSE DUPLICATES DON'T MATTER TO US HERE
    public int missingMultiple(int[] nums, int k) {
        Set<Integer>seen=new HashSet<>();
        for (int num:nums) {
            seen.add(num);
        }
        int cur=k;
        while(seen.contains(cur)){
            cur+=k;
        }
        return cur;
    }
}
