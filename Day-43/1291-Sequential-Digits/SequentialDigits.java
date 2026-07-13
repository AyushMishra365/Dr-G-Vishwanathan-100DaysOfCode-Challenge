import java.util.List;
import java.util.ArrayList;
public class SequentialDigits {
//This method is far too slow bcz it checks every number
    // public List<Integer> sequentialDigits(int low, int high) {
    //     List<Integer> ans= new ArrayList<>();
    //     for(int i=low; i<=high; i++){
    //         if(NumberIsSequential(i)){
    //             ans.add(i);
    //         }
    //     }
    //     return ans;
    // }
    // public  boolean NumberIsSequential(int num){
    //     while(num>=10){
    //         int last= num%10;
    //         int previous=(num/10)%10;
    //         if(previous+1!=last){
    //             return false;
    //         }
    //         num/=10;
    //     }
    //     return true;
    // }

    public List<Integer> sequentialDigits(int low, int high) {
            List<Integer> ans= new ArrayList<>();
            String digits="123456789";
            for(int length=2; length<=9; length++){ //condition given in question
                for(int start=0; start+length<=9;start++){
                    String s= digits.substring(start, start+length); //picks out numbers from string
                    int num= Integer. parseInt(s);
                    if(num>=low && num<=high){ //ans checks here that the chosen number is in the range or not
                        ans.add(num);
                    }
                }
            }
            return ans;
    }
}
