public class CheckDivisibilityByDigitSumAndProduct {
    public static boolean checkDivisibility(int n) {
        int sum=0;
        long product=1;
        while(n!=0){
            int digit=n%10;
            sum+=digit;
            product*=digit;
            n/=10;
        }
        if(n%(sum+product)==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int n=23;
        boolean ans=checkDivisibility(n);
        System.out.println(ans);
    }
}
