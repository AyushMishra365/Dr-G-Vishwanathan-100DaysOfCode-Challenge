public class CinemaSeatAllocation {
   public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        int answer=n*2;  //because each row can have only 2 groups of 4 at once.
        for (int i=0;i<reservedSeats.length;i++){
            int row=reservedSeats[i][0];
            // Process each row only once
            boolean alreadyProcessed=false;
            for(int j=0;j<i;j++){
                if(reservedSeats[j][0]==row){
                    alreadyProcessed=true;
                    break;
                }
            }
            if(alreadyProcessed){
                continue;
            }
            // This row initially had 2 possible families.
            // We will remove them depending on reservations.
            int families = 2;
            boolean[] reserved=new boolean[11];
            // Mark all reserved seats of this row
            for (int j=i;j<reservedSeats.length;j++){
                if(reservedSeats[j][0]==row){
                    reserved[reservedSeats[j][1]] = true;
                }
            }
            boolean left=true;
            boolean middle=true;
            boolean right=true;
            // 2 3 4 5
            for(int seat=2;seat<=5;seat++){
                if(reserved[seat]){
                    left=false;
                }
            }
            // 4 5 6 7
            for(int seat=4;seat<=7;seat++){
                if(reserved[seat]){
                    middle=false;
                }
            }
            // 6 7 8 9
            for(int seat=6;seat<=9;seat++){
                if(reserved[seat]){
                    right=false;
                }
            }
            if(left&&right){
                families=2;
            }
            else if(left||middle||right){
                families=1;
            }
            else {
                families=0;
            }
            // The row initially contributed 2.
            // Replace that with its actual value.
            answer-=2;
            answer+=families;
        }

        return answer;
    } 
}

