import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class FindXORSumOfAllPairsBitwiseAND {
    public static int getXORSum(int[] arr1, int[] arr2) {
        //  List<Integer> ans= new ArrayList<Integer>();
        // for(int i=0; i < arr1.length; i++){
        //     for(int j=0; j < arr2.length; j++){
        //         ans.add(arr1[i]&arr2[j]);
        //     }
        // }
        // int result=0;
        // for(int n:ans){
        //     result^=n;
        // }
        // return result;   
        
        //This above method is also logically correct but it just takes a lot of space. 
        //So rather what we can do is that we know AND is distributive over XOR i.e. (a & b) ^ (c & b) = (a ^ c) & b

        int ans1=0;
        for(int n: arr1){
            ans1^=n;
        }
        int ans2=0;
        for(int n: arr2){
            ans2^=n;
        }
        return ans1&ans2;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {6,5};
        System.out.println(getXORSum(arr1,arr2));
    }
}
