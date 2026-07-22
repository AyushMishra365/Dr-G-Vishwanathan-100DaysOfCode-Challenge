import java.util.ArrayList;
import java.util.List;
public class PrintWordsVertically {
    public List<String> printVertically(String s) {
        String[] words= s.split(" ");
        int maxLen=0;
        for (String word:words){
            maxLen =Math.max(maxLen,word.length());
        }
        List<String> ans= new ArrayList<>();
        for(int column=0; column<maxLen;column++){
            StringBuilder sb= new StringBuilder();
            for(String word: words){
                if(column<word.length()){
                    sb.append(word.charAt(column));
                }
                else sb.append(' ');
            }
            while (sb.length() > 0 && sb.charAt(sb.length() - 1) == ' ') {
                    sb.deleteCharAt(sb.length() - 1);
                }
            ans.add(sb.toString());
        }
        return ans;
    }
}
