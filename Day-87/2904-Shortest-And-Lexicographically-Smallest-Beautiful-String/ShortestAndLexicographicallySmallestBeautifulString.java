public class ShortestAndLexicographicallySmallestBeautifulString {
//SLIDING WINDOW APPROACH
    public String shortestBeautifulSubstring(String s, int k) {
        int left=0;
        int ones=0;
        int bestStart=-1;
        int bestLength=Integer.MAX_VALUE;
        for (int right=0;right<s.length(); right++){
            if(s.charAt(right)=='1'){
                ones++;
            }
            while (ones==k){
                int length=right-left+1;
                if (length<bestLength||(length==bestLength&&s.substring(left,right+1).compareTo(s.substring(bestStart,bestStart+bestLength))<0)){
                    bestStart=left;
                    bestLength=length;
                }
                if(s.charAt(left)=='1'){
                    ones--;
                }
                left++;
            }
        }
        if(bestStart==-1){
            return "";
        }
        return s.substring(bestStart,bestStart+bestLength);
    }


    // public String shortestBeautifulSubstring(String s, int k) {
    //     String ans="";
    //     int n=s.length();
    //     for(int i=0;i<n;i++){
    //         int count=0;
    //         StringBuilder cur=new StringBuilder();
    //         for(int j=i;j<n;j++){
    //             cur.append(s.charAt(j));
    //             if(s.charAt(j)=='1')
    //                 count++;
    //             if(count>k)
    //                 break;
    //             if(count==k){
    //                 String curStr=cur.toString();
    //                 if(ans.isEmpty()||curStr.length()<ans.length()||(curStr.length()==ans.length()&&curStr.compareTo(ans) < 0)){
    //                     ans=curStr;
    //                 }
    //             }
    //         }
    //     }
    //     return ans;
    // }
}
