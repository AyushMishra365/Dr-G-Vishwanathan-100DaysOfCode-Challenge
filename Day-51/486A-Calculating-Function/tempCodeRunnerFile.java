import java.util.Scanner;
public class CalculatingFunction {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long n= sc.nextInt();
        long ans=0;
        int i=1;
        while(i<=n){
            if(i%2!=0){
                ans-=i;
            }
            else ans+=i;
            i++;
        }
        System.out.println(ans);
    }
}
