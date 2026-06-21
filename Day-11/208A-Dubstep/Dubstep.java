import java.util.*;

public class Dubstep {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        s = s.replace("WUB", " ");

        System.out.println(s.trim());

        sc.close();
    }
}