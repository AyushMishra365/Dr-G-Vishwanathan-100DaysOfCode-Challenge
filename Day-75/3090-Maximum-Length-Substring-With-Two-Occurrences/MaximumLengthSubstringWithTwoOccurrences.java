public class MaximumLengthSubstringWithTwoOccurrences {
    public int maximumLengthSubstring(String s) {
        //slower solution, but my thought
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int[] count = new int[26];
            for (int j = i; j < s.length(); j++) {
                int index = s.charAt(j) - 'a';
                count[index]++;
                if (count[index] > 2) {
                    break;
                }
                ans = Math.max(ans, j - i + 1);
            }
        }
        return ans;
    }
    //sliding window solution
    // public int maximumLengthSubstring(String s) {
    //     int[] count= new int[26];
    //     int left=0;int ans=0;
    //     for(int right=0;right<s.length();right++){
    //         int index=s.charAt(right)-'a';
    //         count[index]++;
    //         while(count[index]>2){
    //             count[s.charAt(left)-'a']--;
    //             left++;
    //         }
    //         ans=Math.max(ans,right-left+1);
    //     }
    //     return ans;
    // }
}
