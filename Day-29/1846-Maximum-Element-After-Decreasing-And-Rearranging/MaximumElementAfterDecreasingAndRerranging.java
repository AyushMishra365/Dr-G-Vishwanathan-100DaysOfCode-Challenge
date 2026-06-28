import java.util.Arrays;
public class MaximumElementAfterDecreasingAndRerranging {
        public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        arr[0]=1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>arr[i - 1]){  //OR use condition given in question, if(Math.abs(arr[i] - arr[i - 1]) > 1) but the array is already so no mean s
                arr[i]=arr[i-1]+1;
            }
        }
        return arr[arr.length-1];
        //OR
        // int max = arr[0];
        // for(int i=1; i<arr.length; i++){
        //     if(arr[i] > max){
        //         max = arr[i];
        //     }
        // }
        // return max;



        //ANOTHER SOLUTION, but not better in time :
        // Arrays.sort(arr);

        // arr[0] = 1;

        // for(int i = 1; i < arr.length; i++) {
        //     arr[i] = Math.min(arr[i], arr[i-1] + 1);
        // }

        // return arr[arr.length-1];
    }
}
