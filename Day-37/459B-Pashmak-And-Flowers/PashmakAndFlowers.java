import java.util.Arrays;
import java.util.Scanner;
public class PashmakAndFlowers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int difference=arr[n-1]-arr[0];
        if (difference == 0) {
            System.out.println(difference + " " + (long)n * (n - 1) / 2);
            return;
        }
        long minCount=0;
        long maxCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==arr[0]){
                minCount++;
            }
            if(arr[i]==arr[n-1]){
                maxCount++;
            }            
        }
        System.out.println(difference + " " + minCount*maxCount);
    }
}
