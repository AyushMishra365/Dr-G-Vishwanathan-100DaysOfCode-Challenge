import java.util.Arrays;
import java.util.Scanner;
public class BoyOrGirl {
    public static void main(String[] args) {  
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char[] arr=s.toCharArray();
        Arrays.sort(arr);
        int count=1;
        for(int i=1;i<s.length();i++){
            if(arr[i]!=arr[i-1]){
                count++;
            }
        }
        if(count%2==0){
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}
