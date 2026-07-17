import java.util.Arrays;
public class KthFactorOfN {
    public int kthFactor(int n, int k) {
        // int[] arr= new int[n];
        // int index=0;
        // for(int i=1;i<=n;i++){
        //     if(n%i==0){
        //         arr[index]=i;
        //         index++;
        //     }
        // }
        // if(k>index){
        //     return -1;
        // }
        // return arr[k-1];

        //this above method is good and simple but as given in question we can also try to solve this in O(n) complexity.

        int count=0;
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    count++;
                }
                if(count==k){
                    return i;
                }
            }
            return -1;

    }
}
