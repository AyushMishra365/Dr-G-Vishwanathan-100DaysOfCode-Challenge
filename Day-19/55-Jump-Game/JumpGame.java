public class JumpGame {
    public static boolean canJump(int[] arr) {
        arr=[3,2,1,0,4];
        int last=arr.length;
        int position=1;
        while(position!=arr.length+1){
            if(position==0){
                return false;
            }
            position+=arr[position];
            if(position==last){
                return true;
            }
        }
        return false;
    }
}
