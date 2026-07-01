public class SumOfSquareNumbers {
    public boolean judgeSquareSum(int c) {
        //method 1: brute force method
        //b² = c - a²
        // for(long a = 0; a * a <= c; a++) {
        //     long b = c - a * a;
        //     long root = (long)Math.sqrt(b);
        //     if(root * root == b) { //if b is perfect square or not
        //         return true;
        //     }
        // }
        // return false;

         //two pointer approach 
        long start=0;
        long end= (long)Math.sqrt(c);
        while(start<=end){
            long totalnumber= start*start + end*end;
            if(totalnumber>c){
                end--;
            }
            else if(totalnumber<c){
                start++;
            }
            else{
                return true;
            }
        }
        return false;
    }
}

