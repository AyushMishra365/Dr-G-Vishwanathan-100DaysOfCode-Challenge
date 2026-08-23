public class SumGame {
//FAST SOLUTION : PURELY MAtHS : This solution realizes that you can reduce the entire game to Compare the expected sums of the two halves.
    public boolean sumGame(String num) {
        int n=num.length();
        double ans=0.0;
        for(int i=0;i<n/2;++i){
            ans+=getExpectation(num.charAt(i));
        }
        for(int i=n/2;i<n;++i){
            ans-=getExpectation(num.charAt(i));
        }
        return ans!=0.0;
    }
    private double getExpectation(char c) {   //A ? can become any digit: 0 1 2 3 4 5 6 7 8 9. The average is: (0+1+2+3+4+5+6+7+8+9)/10 = 45/10 =4.5. So the code treats ? → 4.5 as its expected value.
        return c=='?'?4.5:c-'0';
    }
//SLOW SOLUTION

    //public boolean sumGame(String num) {
        // int leftSum=0; int rightSum=0;
        // int leftQuestion=0; int rightQuestion=0;
        // for (int i = 0; i < num.length()/2; i++) {
        //     if(num.charAt(i)=='?'){
        //         leftQuestion++;
        //     }
        //     else leftSum+=num.charAt(i)-'0';
        // }
        // for (int i = num.length()/2; i < num.length(); i++) {
        //     if(num.charAt(i)=='?'){
        //         rightQuestion++;
        //     }
        //     else rightSum+=num.charAt(i)-'0';
        // }
        // if(leftQuestion==rightQuestion){
        //     return leftSum!=rightSum;
        // }
        // if((leftQuestion+rightQuestion)%2==1){
        //     return true;
        // }
        // else return leftSum - rightSum != (rightQuestion - leftQuestion) * 9 /2;
    //}
}
