import java.util.*;

public class CapsLock {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        boolean change = true;

        for (int i = 1; i < s.length(); i++) {

            if (Character.isLowerCase(s.charAt(i))) {

                change = false;
                break;
            }
        }

        if (change) {

            StringBuilder ans = new StringBuilder();

            for (char c : s.toCharArray()) {

                if (Character.isUpperCase(c)) {
                    ans.append(Character.toLowerCase(c));
                } else {
                    ans.append(Character.toUpperCase(c));
                }
            }

            System.out.println(ans);

        } else {

            System.out.println(s);
        }

        sc.close();
    }
}