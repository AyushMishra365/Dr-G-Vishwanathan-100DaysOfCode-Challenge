public class SumOfPrimesBetweenNumberAndItsReverse {
    public int sumOfPrimesInRange(int n) {
    int sum=0;
    int original=n;
        int reverse=0;
        while(n!=0){
            int digit=n%10;
            reverse=reverse*10+digit;
            n/=10;
        }
        int max=Math.max(original,reverse);
        int min=Math.min(original,reverse);
        for(int i=min;i<=max;i++){
            if(primes(i)){
                sum+=i;
            }
        }
        return sum;
    }
    public boolean primes(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
