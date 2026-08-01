public class PredictTheWinner {
//BRUTE FORCE SOLUTION
    // public boolean predictTheWinner(int[] nums) {
    //     return solve(nums, 0, nums.length-1, 0,0,true);
    // }
    // public boolean solve(int[] nums, int left, int right,int score1, int score2, boolean player1turn){
    //     if(left > right) {
    //         return score1 >= score2;
    //     }
    //     if(player1turn){
    //         boolean pickleft= solve(nums, left+1, right, score1+nums[left], score2, false);
    //         boolean pickright= solve(nums, left, right-1, score1+nums[right],score2,false);
    //         return pickleft || pickright;
    //     }
    //     else{
    //         boolean pickleft= solve(nums,left+1, right, score1, score2+nums[left],true);
    //         boolean pickright= solve(nums,left, right-1, score1, score2+nums[right],true);
    //         return pickleft && pickright;
    //     }
    // }

//DP solution
    Integer[][] dp;  //Integer[][] used bcz later we check that the value is already calculated or not by intializing it as null, and int[][] cannot hold null values inside it but Integer[][] can.
    public boolean predictTheWinner(int[] nums) {
        int n=nums.length;
        dp=new Integer[n][n];
        return solve(nums,0,n-1)>=0;  //>=0 bcz if later on player1 score is mroe than player2, then solve() result will be greater than or equal to 0 so true otherwise false
    }
    public int solve(int[] nums, int left, int right){
        if(left==right){
            return nums[left];
        }
        if(dp[left][right]!=null){  //to check if the value is already calculated or not
            return dp[left][right];
        }
        int pickleft=nums[left]-solve(nums,left+1,right);   //nums[left] is added bcz player1 is picking the left value and then we subtract the result of player2's turn from it
        int pickright=nums[right]-solve(nums,left,right-1); //nums[right] is added bcz player1 is picking the right value and then we subtract the result of player2's turn from it
        dp[left][right]=Math.max(pickleft,pickright);  //we take the maximum of both the choices bcz player1 will always try to maximize his score
        return dp[left][right]; 
    }
}
