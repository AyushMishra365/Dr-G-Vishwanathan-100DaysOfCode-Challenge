import java.util.ArrayList;
import java.util.List;
public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans = new ArrayList<>();
        for(int i=0; i<intervals.length;i++){
            int start=intervals[i][0];
            int end= intervals[i][1];
            if(end<newInterval[0]){
                ans.add(new int[]{start, end});
            }
            else if (start>newInterval[1]){
                ans.add(new int[]{newInterval[0],newInterval[1]});
                newInterval=intervals[i];
            }
            else {
                newInterval[0]=Math.min(newInterval[0],start);
                newInterval[1]=Math.max(newInterval[1],end);
            }
        }
        ans.add(new int[]{newInterval[0], newInterval[1]});
        int[][] result = new int[ans.size()][2];
        for (int i=0;i<ans.size();i++){
            result[i]=ans.get(i);
        }
        return result;
    }
}
