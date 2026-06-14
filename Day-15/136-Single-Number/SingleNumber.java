public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 3};
        int res=0;
        for(int n:nums){
            res^=n;
        }
         System.out.println(res);   
    }
}