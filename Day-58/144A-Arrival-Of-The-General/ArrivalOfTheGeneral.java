import java.util.Scanner;
public class ArrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int nums=sc.nextInt();
        int[] arr= new int[nums];
        for(int i=0;i<nums;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        int m=0,n=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                m=i;
            }
            if(arr[i]<=min){
                min=arr[i];
                n=i;
            }
        }
        if(m>n){
            System.out.println(m+(arr.length-1-n)-1);
        }
        else{
            System.out.println(m+(arr.length-1-n));
        }
    }
}
