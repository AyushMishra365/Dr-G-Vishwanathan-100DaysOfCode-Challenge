import java.util.Arrays;
import java.util.Scanner;
public class ValidAnagram {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= new String();
        String t= new String();
        s=sc.next();
        t=sc.next();
        s="anagram";  //example string
        t="nagaram";  //example string
        System.out.println(CheckValidAnagram(s,t));
    }
    public static boolean CheckValidAnagram(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0; i<a.length;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
}
