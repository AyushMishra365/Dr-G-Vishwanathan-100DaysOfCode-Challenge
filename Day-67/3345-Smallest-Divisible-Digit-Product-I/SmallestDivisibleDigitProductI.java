public class SmallestDivisibleDigitProductI {
    public static int smallestNumber(int n, int t) {
        int currentNum=n;
        while(true){
            int extract=currentNum;int product=1;
            while(extract>0){
                int digit=extract%10;
                if(digit==0){
                    product=0;
                    break;
                }
                product*=digit;
                extract/=10;
            }
            if(product%t==0){
                return currentNum;
            }
            currentNum++;
        }
    }
    public static void main(String[] args) {
        int n=15;
        int t=3;
        System.out.println(smallestNumber(n,t));
    }
}