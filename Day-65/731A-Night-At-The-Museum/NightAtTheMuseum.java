import java.util.Scanner;
public class NightAtTheMuseum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= new String();
        str= sc.next();
        char[] clockwise= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] anticlockwise= {'a','z','y','x','w','v','u','t','s','r','q','p','o','n','m','l','k','j','i','h','g','f','e','d','c','b'};
        char current='a';
        int sum=0;
        for(int i=0;i<str.length();i++){
            int currentClock=0;
            int currentAnti=0;
            for (int j=0;j<26;j++) {
                if (clockwise[j] == current)
                    currentClock=j;
                if (anticlockwise[j] == current)
                    currentAnti = j;
            }
            int cw = 0;
            int idx = currentClock;
            while(clockwise[idx]!=str.charAt(i)) {
                idx = (idx + 1) % 26;
                cw++;
            }
            int acw = 0;
            idx=currentAnti;
            while (anticlockwise[idx]!=str.charAt(i)) {
                idx = (idx + 1) % 26; //for counting circular means after 26 alphabets , if we have to go to a then we have to go to z and then y and so on, that's why (25+1)%26
                acw++;
            }
            sum += Math.min(cw, acw);
            current = str.charAt(i);
        }
        System.out.println(sum);
    }
}
