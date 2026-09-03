public class ConstructUniformParityArrayII {
// we don't need to count even and odd at all

    // public boolean uniformArray(int[] nums1) {
    //     int even=0; int odd=0;
    //     int minOdd=Integer.MAX_VALUE;
    //     for (int i = 0; i < nums1.length; i++) {
    //         if(nums1[i]%2==0){
    //             even++;
    //         }
    //         else{
    //             odd++;
    //             minOdd=Math.min(minOdd,nums1[i]);
    //         }
    //     }
    //     if(even==0){
    //         return true;
    //     }
    //     else if(odd==0){
    //         return true;
    //     }
    //     else{
    //         for (int i = 0; i < nums1.length; i++) {
    //             if(nums1[i]%2==0 && nums1[i]<minOdd){
    //                 return false;
    //             }
    //         }
    //     }
    //     return true;
    // }

//better solution
    public boolean uniformArray(int[] nums1) {
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < nums1.length; i++) {
            min=Math.min(min,nums1[i]);
        }
        if(min%2==1){
            return true;
        }
        else{
            for (int i = 0; i < nums1.length; i++) {
                if(nums1[i]%2==1){
                    return false;
                }
            }
        }
        return true;
    }
}
