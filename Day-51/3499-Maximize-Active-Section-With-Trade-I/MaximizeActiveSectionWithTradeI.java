public class MaximizeActiveSectionWithTradeI {
    public int maxActiveSectionsAfterTrade(String s) {
        s="1"+s+"1";
        int totalOnes=0;
        for(int i=1; i<s.length()-1;i++){
            if(s.charAt(i)=='1'){
                totalOnes++;
            }
        }
        int ans=totalOnes;
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='1'){
                int start=i;
                while (i<s.length() && s.charAt(i)=='1') {
                    i++;
                }
                int end=i-1;
                if(start>0 && end<s.length()-1 && s.charAt(start-1)=='0' && s.charAt(end+1)=='0'){
                    int left = 0;
                    int j = start - 1;
                    while (j >= 0 && s.charAt(j) == '0') {
                        left++;
                        j--;
                    }
                    int right = 0;
                    int k = end + 1;
                    while (k <s.length() && s.charAt(k) == '0') {
                        right++;
                        k++;
                    }
                    ans=Math.max(ans,totalOnes+left+right);
                }
            }
            else{
                i++;
            }
        }
        return ans;
    }
}
