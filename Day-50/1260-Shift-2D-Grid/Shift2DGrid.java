import java.util.ArrayList;
import java.util.List;
public class Shift2DGrid {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        //step by step shifting-> slow method
        // int m = grid.length;
        // int n = grid[0].length;

        // while (k-- > 0) {

        //     int last = grid[m - 1][n - 1];

        //     for (int i = m - 1; i >= 0; i--) {

        //         for (int j = n - 1; j >= 0; j--) {

        //             if (i == 0 && j == 0)
        //                 continue;

        //             if (j == 0)
        //                 grid[i][j] = grid[i - 1][n - 1];
        //             else
        //                 grid[i][j] = grid[i][j - 1];
        //         }
        //     }

        //     grid[0][0] = last;
        // }

        // List<List<Integer>> ans = new ArrayList<>();

        // for (int i = 0; i < m; i++) {
        //     List<Integer> row = new ArrayList<>();

        //     for (int j = 0; j < n; j++) {
        //         row.add(grid[i][j]);
        //     }

        //     ans.add(row);
        // }

        // return ans;


        //better and standard solution, formulas used in this are standard matrix formulas which are used in many of the matrix problems
        int m = grid.length;
        int n = grid[0].length;
        int total = m * n;
        k %= total;
        int[][] shifted = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int oldIndex = i * n + j;
                int newIndex = (oldIndex + k) % total;

                int newRow = newIndex / n;
                int newCol = newIndex % n;

                shifted[newRow][newCol] = grid[i][j];
            }
        }

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < m; i++) {

            List<Integer> row = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                row.add(shifted[i][j]);
            }

            ans.add(row);
        }

        return ans;
    }
}
