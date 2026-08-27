public class NumberOfSubstringsContainingAllThreeCharacters {
//BRUTE FORCE --> SLOW
    // public static int numberOfSubstrings(String s) {
    //     char[] arr= s.toCharArray();
    //     int count=0;
    //     for (int i = 0; i < arr.length-1; i++) {
    //         boolean seenA=false;
    //         boolean seenB=false;
    //         boolean seenC= false;
    //         if(arr[i]=='a'){
    //             seenA=true;
    //         }
    //         else if(arr[i]=='b'){
    //             seenB=true;
    //         }
    //         else{
    //             seenC=true;
    //         }
    //         for (int j = i+1; j < arr.length; j++) {
    //             if(arr[j]=='a'){
    //                 seenA=true;
    //             }
    //             else if(arr[j]=='b'){
    //                 seenB=true;
    //             }
    //             else{
    //                 seenC=true;
    //             }

    //             if(seenA&&seenB&&seenC){
    //                 count+=(arr.length-j);
    //                 break;
    //             }
                
    //         }
    //     }
    //     return count;
    // }
    // public static void main(String[] args) {
    //     String s = "aaacb";
    //     int ans=numberOfSubstrings(s);
    //     System.out.println(ans);
    // }

    public static int numberOfSubstrings(String s) {
        int lastA=-1;
        int lastB=-1;
        int lastC=-1;
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='a'){
                lastA=i;
            }
            else if(s.charAt(i)=='b'){
                lastB=i;
            }
            else{
                lastC=i;
            }
            if(lastA!=-1 && lastB!=-1 && lastC!=-1){
                int smallest=Math.min(lastA,Math.min(lastB,lastC));  //tells us the position where the substring is starting
                count+=smallest+1;
            }
        }
        return count;
    }
}
