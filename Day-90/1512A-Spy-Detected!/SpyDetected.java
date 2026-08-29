import java.util.Scanner;
public class SpyDetected{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int numValues=sc.nextInt();
            int[] arr=new int[numValues];
            for (int i = 0;i<numValues; i++) {
                arr[i]=sc.nextInt();
            }
            int common=0;
            if(arr[0]==arr[1]){
                common=arr[0];
            }
            else if(arr[0]==arr[2]){
                common=arr[0];
            }
            else{
                common=arr[1];
            }
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]!=common){
                    System.out.println(i+1);
                    break;
                }
            }
        }
    }
}
