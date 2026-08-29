import java.util.Arrays;
import java.util.Scanner;
public class BersUBall {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] boys=new int[n];
        for (int i = 0; i < boys.length; i++) {
            boys[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int[] girls=new int[m];
        for (int i = 0; i < girls.length; i++) {
            girls[i]=sc.nextInt();
        }
        Arrays.sort(boys);
        Arrays.sort(girls);
        int b=0;
        int g=0;
        int pairs=0;
        while(b<n && g<m) {
            if(Math.abs(boys[b]-girls[g])<=1){
                b++;
                g++;
                pairs++;
            }
            else if(boys[b]<girls[g]){
                b++;
            }
            else g++;
        }
        System.out.println(pairs);
    }
}
