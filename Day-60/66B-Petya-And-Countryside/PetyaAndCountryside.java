import java.util.Scanner;
public class PetyaAndCountryside {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int ans=1;
        for (int i=0;i<n;i++){
            int count=1;
            int j=i;
            while(j>0 && arr[j-1]<=arr[j]){
                count++;
                j--;
            }
            j=i;
            while(j<n-1 && arr[j+1]<=arr[j]){
                count++;
                j++;
            }
            ans=Math.max(ans,count);
        }
        System.out.println(ans);
    }
}
