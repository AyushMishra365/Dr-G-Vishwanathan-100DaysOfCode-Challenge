import java.util.Scanner;
import java.util.Arrays;
public class ILoveUsername {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count=0;
        int max=arr[0];
        int min=arr[0];
        for(int i=1; i<n; i++){
            if(arr[i]>max){
                max=arr[i];
                count++;
            }
            else if(arr[i]<min){
                min=arr[i];
                count++;
            }
        }
        System.out.println(count);
    }
}
