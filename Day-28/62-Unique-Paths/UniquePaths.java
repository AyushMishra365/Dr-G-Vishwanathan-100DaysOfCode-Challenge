public class UniquePaths {
    public int uniquePaths(int m, int n) {  
        //THIS IS DISCRETE MATHEMATICS GRID WALK PROBLEM SOLUTION: where ans= C(m+n)
        int N = m + n - 2;   //-2 bcz we are laready standing at (1,1) point so, (m-1)+(n-1) = m+n-2
        int r = Math.min(m - 1, n - 1);  //min bcz m+nCm = m+nCn
        long ans = 1;
        for(int i = 1; i <= r; i++) {  //loop runs only till r, which is the minimum value o fthe grid 
            ans = ans * (N - r + i) / i;  //this loop makes the combinatorics formula told above, you can dry run and check
        }
        return (int) ans;
    }
}
