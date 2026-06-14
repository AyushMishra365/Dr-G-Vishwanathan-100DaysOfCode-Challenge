// https://codeforces.com/problemset/problem/41/A
import java.util.Scanner;
public class Translation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        if (s.length()!=t.length()){
            System.out.println("NO");
            return;
        }
        boolean reversed = true;
        for (int i=0;i<s.length(); i++){
            if (s.charAt(i)!=t.charAt(t.length()-1-i)){
                reversed=false;
                break;
            }
        }
        System.out.println(reversed ? "YES" : "NO");
     }
}

        // StringBuilder reversed=new StringBuilder(t).reverse();
        // if(s.equals(reversed.toString())){
        //     System.out.println("YES");
        // } else {
        //     System.out.println("NO");
        // }