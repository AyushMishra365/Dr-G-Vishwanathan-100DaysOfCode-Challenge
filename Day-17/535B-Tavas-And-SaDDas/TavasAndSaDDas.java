import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class TavasAndSaDDas {
    //https://codeforces.com/problemset/problem/535/B
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        long ans=0;
        for (int i=0;i<s.length(); i++){
            ans=ans*2;
            if (s.charAt(i)=='7'){
                ans+=1;
            }
        }
        ans += (1L<<s.length())-1;
        System.out.println(ans);
        sc.close();
    }
}