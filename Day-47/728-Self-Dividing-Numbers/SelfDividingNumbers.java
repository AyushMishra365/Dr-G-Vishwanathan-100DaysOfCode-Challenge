import java.util.ArrayList;
import java.util.List;
public class SelfDividingNumbers {
   public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans=new ArrayList<>();
        int i=left;
        while(i<=right){
            if(checkNum(i)==true){
                ans.add(i);
            }
            i++;
        }
        return ans;
    }
    public boolean checkNum(int i){
        int num=i;
        while(num>0){
            int last = num % 10;
            if(last==0 ||i%last!=0){
                return false;
            }
            num/=10;
        }
        return true;
    }
}
