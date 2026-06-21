//https://leetcode.com/problems/break-a-palindrome/
public class BreakAPalindorme {
    public static void main(String[] args) {
        String palindrome=new String();
        if(palindrome.length()==1) {
            System.out.println("");
            return;
        }
        char[] arr=palindrome.toCharArray();
        for(int i=0;i<arr.length/2;i++){
            if(arr[i]!='a'){
                arr[i]='a';
                System.out.println(new String(arr));
                return;
            }
        }
        arr[arr.length-1]='b';
        System.out.println(new String(arr));
        return;

        //THE LOWER CODE IS ALSO CORRECT, IT JUST TAKES MORE TIME TO EXECUTE, BECAUSE OF THE STRING CONCATENATION, IT CREATES NEW STRING AT EVERY CONCATENATION. 
        // if(palindrome.length()==1){
        //     System.out.println("");
        // }
        // for(int i=0;i<palindrome.length()/2;i++){
        //     if(palindrome.charAt(i)!='a') {
        //         palindrome=palindrome.substring(0, i)+'a'+ palindrome.substring(i + 1);
        //         System.out.println(palindrome);
        //         return;
        //     }
        // }
        // palindrome=palindrome.substring(0, palindrome.length()-1)+'b';
        // System.out.println(palindrome);
    }
}
