import java.util.ArrayList;
public class MaximumNumberOfBalloons {
    public static void main(String[] args) {
        String text= new String();
        text = "nlaebolko";
        if(text.length()<7){
            System.out.println(0);
        }
        int b = 0;
        int a = 0;
        int l = 0;
        int o = 0;
        int n = 0;
        for(int i=0; i<text.length(); i++){
            switch (text.charAt(i)) {
                case 'b': 
                    b++;
                    break;
                case 'a':
                    a++;
                    break;

                case 'l':
                    l++;
                    break;

                case 'o':
                    o++;
                    break;

                case 'n':
                    n++;
                    break;
            }
        }
        int ans= Math.min(Math.min(b,a), Math.min(Math.min(l/2,o/2),n));
        System.out.println(ans);
    }
}
