import java.util.Scanner;
import java.util.Arrays;
public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        str=str.replace("+", "");
        char[] arr=str.toCharArray();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(i>0){
                System.out.print("+");
            }
            System.out.print(arr[i]);
        }
    }
}