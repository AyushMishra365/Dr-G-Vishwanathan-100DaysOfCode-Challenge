//Again similar code as 486, just what has changed here is that we can take upto 3 elements(indexes) from the start instead of picking elements from left or right as in previous questions.
//here we just have to choose picking 1,2 o r3 which makes the difference maximum for the player who is playing at that time. 
// So we can use dp to store the maximum difference for each index and return the result accordingly. 
public class StoneGameIII {
    Integer[] dp;
    public String stoneGameIII(int[] stoneValue) {
        int n=stoneValue.length;
        dp =new Integer[n];
        int diff=solve(stoneValue,0);
        if(diff>0){
            return "Alice";
        }
        else if(diff < 0){
            return "Bob";
        }
        else{
            return "Tie";
        }
    }
    public int solve(int[] stoneValue,int index){
        if(index>=stoneValue.length){
            return 0;
        }
        if(dp[index]!=null){
            return dp[index];
        }
        int take1=stoneValue[index]-solve(stoneValue,index+1);
        int take2=Integer.MIN_VALUE;
        if(index+1<stoneValue.length){
            take2=stoneValue[index]+stoneValue[index+1]-solve(stoneValue,index+2);
        }
        int take3=Integer.MIN_VALUE;
        if(index+2<stoneValue.length){
            take3=stoneValue[index]+stoneValue[index+1]+stoneValue[index+2]-solve(stoneValue,index+3);
        }
        dp[index]=Math.max(take1,Math.max(take2,take3));
        return dp[index];
    }   
}
