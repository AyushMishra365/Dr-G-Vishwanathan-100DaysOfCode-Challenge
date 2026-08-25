import java.util.Scanner;
public class LuckySumOfDigits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int sevens=n/7;
        while(sevens>=0){
            int rem=n-(sevens*7);
            if(rem%4==0){
                int fours=rem/4;
                for (int i = 0; i < fours; i++) {
                    System.out.print("4");
                }
                for (int i = 0; i < sevens; i++) {
                    System.out.print("7");
                }
                return;
            }
            sevens--;
        }
        System.out.println("-1");
    }
}
