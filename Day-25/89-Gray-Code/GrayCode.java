import java.util.List;
import java.util.ArrayList;
public class GrayCode {
    public static List<Integer> grayCode(int n) {
        List<Integer> ans= new ArrayList<>();
        // ans.add(0);
        // for(int i=0; i<n;i++){
        //     int size= ans.size();
        //     for(int j=size-1; j>=0; j--){
        //         ans.add(ans.get(j) | (1<<i));
        //     }
        // }
        // return ans;

        //FORMULA FOR GRAY CODE --> REMEMBER
        for(int i = 0; i < (1 << n); i++) {  
            ans.add(i ^ (i >> 1));  //this is the condition to remember
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=2;
        System.out.println(grayCode(n));
    }
}
