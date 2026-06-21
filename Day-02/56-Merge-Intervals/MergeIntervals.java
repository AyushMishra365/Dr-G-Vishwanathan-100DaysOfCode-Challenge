import java.util.ArrayList;

public class MergeIntervals {

    public int[][] merge(int[][] intervals) {

        for (int i = 0; i < intervals.length - 1; i++) {

            for (int j = i + 1; j > 0; j--) {

                if (intervals[j][0] < intervals[j - 1][0]) {
                    swap(intervals, j, j - 1);
                } else {
                    break;
                }
            }
        }

        ArrayList<int[]> ans = new ArrayList<>();

        int[] current = intervals[0];

        for (int i = 1; i < intervals.length; i++) {

            int[] next = intervals[i];

            if (next[0] <= current[1]) {

                current[1] = Math.max(current[1], next[1]);

            } else {

                ans.add(current);
                current = next;
            }
        }

        ans.add(current);

        return ans.toArray(new int[ans.size()][]);
    }

    static void swap(int[][] arr, int first, int second) {

        int[] temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}