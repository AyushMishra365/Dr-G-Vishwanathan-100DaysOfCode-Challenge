import java.util.Arrays;
public class MinimumNumberOfPushesToTypeWordII {
    public int minimumPushes(String word) {
        int[] frequency= new int[26];
        for(char ch: word.toCharArray()){
            frequency[ch-'a']++;
        }
        Arrays.sort(frequency);
        int ans =0;
        int index=0;
        for(int i=25; i>=0;i--){
            if(frequency[i]==0){
                break;
            }
            ans+=frequency[i]*((index/8)+1);
            index++;
        }
        return ans;
    }
}
