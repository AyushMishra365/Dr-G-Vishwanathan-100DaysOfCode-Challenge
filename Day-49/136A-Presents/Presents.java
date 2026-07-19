import java.util.Scanner;
public class Presents {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n+1];
        for (int i = 1; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int[] ans=new int[n+1];
        for (int i = 1; i < arr.length; i++) {
            ans[arr[i]]=i;
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
