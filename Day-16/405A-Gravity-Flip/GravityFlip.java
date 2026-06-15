//https://codeforces.com/problemset/problem/405/A
import java.util.Scanner;
import java.util.Arrays;
public class GravityFlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a= new int[sc.nextInt()];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for(int i=0; i<a.length;i++){
            System.out.print(a[i]+ " ");
        }
        sc.close();
    }
}

