public class JumpGame {
    public static void main(String[] args) {
        int[] arr= {3,2,1,0,4};
        int last=arr.length-1;
        int position=0;
        for(int i=0; i<arr.length; i++){
            if(i>position){
                System.out.println(false);
            }
            position=Math.max(position, i+arr[i]);
        }
        System.out.println(true);
    }
}
