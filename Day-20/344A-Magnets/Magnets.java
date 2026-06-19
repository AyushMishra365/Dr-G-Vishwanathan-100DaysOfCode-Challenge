import java.util.Scanner;
public class Magnets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arrangement = new int[n];
        for(int i=0; i<n; i++){
            arrangement[i]=sc.nextInt();
        }
        int count=1;
        for(int i=0; i<arrangement.length-1;i++){
            if(arrangement[i]!=arrangement[i+1]){
                count++;
            }
        }
        System.out.println(count);
    }
}
