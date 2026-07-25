import java.util.Arrays;
public class MaximumBuildingHeight {

    //WRONNG APPROACH YOU CANNOT BUILD EACH HEIGHT BCZ THERE IS NO UNIQUE HEIGHT in this question
    //There can be different ways of putting heights on each building incorporating the restrictions.

    // public int maxBuilding(int n, int[][] restrictions) {
    //     int[] heights= new int[n-1];
    //     heights[0]=0;
    //     for(int i=0; i<restrictions.length;i++){
    //         heights[restrictions[i][0]-1]=restrictions[i][1];
    //     }
    //     int i=1;
    //     while(i<heights.length-1 && heights[i+1]-heights[i]==1){
    //         if(heights[i]==0){
    //             heights[i]=i;
    //         }
    //         i++;
    //     }
    //     Arrays.sort(heights);
    //     return heights[heights.length-1];
    // }

    public int maxBuilding(int n, int[][] restrictions) {
        if(restrictions.length==0){  // If there are no restrictions
            return n-1;
        }
        //we want to add restriction for building 1 also in the restrictions array, bcz the problem deos not adds it in but we know that it's there , so we take restrictions.length+1 as loop length condition
        int[][] arr = new int[restrictions.length+1][2]; // Add building 1 with height 0
        arr[0][0]=1;
        arr[0][1]=0;
        //here it becomes [1][0]
        for (int i=0;i<restrictions.length;i++){ //insert this into restrictions
            arr[i+1]=restrictions[i];
        }
        // Sort by building number
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        // Left to Right pass: 
            // Imagine (2,1), (5,100)
            //Can building 5 really have height 100?   No.
            // Distance is 5-2 = 3  Maximum increase is 1 per building So highest possible height is 1+3 = 4
            // Therefore building 5 ≤ 4 not 100.  So we update
            // restriction = min(current restriction,previous height + distance)
            // Example
            // (2,1)(5,100) becomes (5,4)
        for (int i=1;i<arr.length;i++){
            int distance=arr[i][0]-arr[i-1][0];
            arr[i][1]=Math.min(arr[i][1],arr[i-1][1]+distance);
        }
        // Right to Left pass
        // Now suppose (2,100) (5,3) Can building 2 be height 100? No.
        //Distance is 3   Building 5 is at most 3  So building 2 can be at most 3+3=6
        // Therefore (2,6)
        for (int i=arr.length-2;i>=0;i--){
            int distance=arr[i+1][0]-arr[i][0];
            arr[i][1]=Math.min(arr[i][1],arr[i+1][1]+distance);
        }
        int ans = 0;
        // Find maximum peak between every adjacent restriction
        for(int i=0; i<arr.length-1;i++){
            int x1=arr[i][0];
            int h1=arr[i][1];
            int x2=arr[i+1][0];
            int h2=arr[i+1][1];
            int distance=x2-x1;
            int peak=Math.max(h1,h2)+(distance-Math.abs(h1-h2))/2;
            ans=Math.max(ans,peak);
        }
        // Buildings after the last restriction
        int lastBuilding=arr[arr.length-1][0];
        int lastHeight=arr[arr.length - 1][1];
        ans = Math.max(ans,lastHeight+(n-lastBuilding));
        return ans;
    }
}
    
