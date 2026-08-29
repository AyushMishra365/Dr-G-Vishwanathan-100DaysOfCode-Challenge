import java.util.Arrays;
public class SumOfDistances {
    public long[] distance(int[] nums) {
        long[] result=new long[nums.length];
        int n=nums.length;
        int[][] arr=new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0]=nums[i]; 
            arr[i][1]=i;       
        }
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        int start=0;
        while(start<n){
            int end=start;
            while(end<n&&arr[end][0]==arr[start][0]){
                end++;
            }
            long totalSum=0;
            for(int i=start;i<end;i++){
                totalSum+=arr[i][1];
            }
            long lessSum=0;
            for(int i=start;i<end;i++){
                long position=arr[i][1];
                int leftCount=i-start;
                int rightCount=end-i-1;
                long moreSum=totalSum-lessSum-position;
                long leftSum=position*leftCount-lessSum;
                long rightSum=moreSum-position*rightCount;
                result[(int)position]=leftSum+rightSum;
                lessSum+=position;
            }
            start=end;
        }
        return result;
    }
//TLE CODE

    // public long[] distance(int[] nums) {
    //     long[] result=new long[nums.length];
    //     for (int i = 0; i < nums.length; i++) {
    //         int[] positions=new int[nums.length];
    //         int index=0;
    //         for(int j=0;j< nums.length;j++){
    //             if(nums[j]==nums[i]){
    //                 positions[index]=j;
    //                 index++;
    //             }
    //         }
    //         int totalSum=0;
    //         for(int j=0;j<index;j++){
    //             totalSum+=positions[j];
    //         }
    //         int lessSum=0;
    //         for (int p=0;p<index;p++){
    //             if(positions[p]==i){
    //                 int leftCount=p;
    //                 int rightCount=index-p-1;
    //                 int moreSum=totalSum-lessSum-i;
    //                 long leftSum=(long)i*leftCount-lessSum;
    //                 long rightSum=moreSum-(long)i*rightCount;
    //                 result[i]=leftSum+rightSum;
    //                 break;
    //             }
    //         lessSum+=positions[p];
    //         }
    //     }
    //     return result;
    // }
}
