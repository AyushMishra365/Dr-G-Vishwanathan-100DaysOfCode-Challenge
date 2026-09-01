import java.util.Arrays;
public class DetermineIfTwoStringsAreClose {
    public boolean closeStrings(String word1, String word2) {
//foir this question we just have 3 conditions to check
    //first is whether the length of the two given strings are equal or not
        if(word1.length()!=word2.length()){
            return false;
        }
        int[] freq1= new int[26];
        int[] freq2= new int[26];
        for (int i = 0; i < word1.length(); i++) {
            freq1[word1.charAt(i)-'a']++;
        }
        for (int i = 0; i < word2.length(); i++) {
            freq2[word2.charAt(i)-'a']++;
        }
        //second is if both the strings have same characters in them
        for (int i = 0; i < 26; i++) {
            if((freq1[i]==0 && freq2[i]!=0)||(freq1[i]!=0&& freq2[i]==0)){
                return false;
            }
        }
        Arrays.sort(freq1);
        Arrays.sort(freq2);
        //third one is if the frequency array of both of them equal i.e  if it is not equal that means that there is any element which is more in number than in the other string, so we will never be able to natch both the stirngs.
        for (int i = 0; i < 26; i++) {
            if(freq1[i]!=freq2[i]){
                return false;
            }
        }
        return true;
    }
}
