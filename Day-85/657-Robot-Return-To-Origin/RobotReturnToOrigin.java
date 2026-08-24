public class RobotReturnToOrigin {
    public boolean judgeCircle(String moves) {
        char[] ch= moves.toCharArray();
        int countU=0;
        int countD=0;
        int countL=0;
        int countR=0;
        for(int i=0; i<ch.length;i++){
            if(ch[i]=='U'){
                countU++;
            }
            if(ch[i]=='D'){
                countD++;
            }
            if(ch[i]=='L'){
                countL++;
            }
            if(ch[i]=='R'){
                countR++;
            }
        }
        if(countL==countR && countU==countD){
            return true;
        }
        return false;
    }

}
