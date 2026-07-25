import java.util.Arrays;
public class MaximumProductOfTwoDigits {
    //SLOW METHOD

    // public int maxProduct(int n) {
    //     int temp=n;
    //     int digits=0;
    //     while (temp>0){
    //         digits++;
    //         temp /=10;
    //     }
    //     int[] arr= new int[digits];
    //     int i=arr.length-1;
    //     while(i>=0){
    //         arr[i]=n%10;
    //         n/=10;
    //         i--;
    //     }
    //     Arrays.sort(arr);
    //     return arr[arr.length-2]* arr[arr.length-1];
    // }

    //Fast Method
    public int maxProduct(int n) {
        int first=0; 
        int second=0;
        while(n>0){
            int digits=n%10;
            if(digits>=first){
                second=first;
                first=digits;
            }
            else if(digits>second){
                second=digits;
            }
            n/=10;
        }
        return first*second;
    }
}
