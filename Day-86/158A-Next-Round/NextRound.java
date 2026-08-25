import java.util.Scanner;
public class NextRound {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] players=new int[n];
        for (int i = 0; i < players.length; i++) {
            players[i]=sc.nextInt();
        }
        int score=players[k-1];
        int count=0;
        for (int i = 0; i < players.length; i++) {
                if(players[i]>=score && players[i]>0){
                count++;
            }
        }
        System.out.println(count);
    }
}
