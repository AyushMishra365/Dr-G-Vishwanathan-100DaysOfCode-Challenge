import java.util.Scanner;

public class PetyaAndStrings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println(compare(str1, str2));

        sc.close();
    }

    public static int compare(String str1, String str2) {

        int ans = str1.compareToIgnoreCase(str2);

        if (ans > 0) {
            return 1;
        }
        else if (ans < 0) {
            return -1;
        }
        else {
            return 0;
        }
    }
}