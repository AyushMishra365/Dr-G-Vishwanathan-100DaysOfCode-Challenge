import java.util.Arrays;
import java.util.Scanner;
public class ThreePairwiseMaximums{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            int[] arr= new int[3];
            arr[0]=sc.nextInt();
            arr[1]=sc.nextInt();
            arr[2]=sc.nextInt();
            Arrays.sort(arr);
            if(arr[1]!=arr[2]){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
                System.out.println(arr[0]+" "+arr[0]+ " " + arr[2] );
            }
            n--;
        }
    }
}
