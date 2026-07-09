import java.util.Scanner;
public class KyoyaAndPhotobooks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= new String();
        s=sc.next();  
        System.out.println(26*(s.length()+1)-s.length()); 
        sc.close();
    }
}
