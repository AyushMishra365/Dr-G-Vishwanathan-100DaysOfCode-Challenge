public class CountPrimes {
    // public static int countPrimes(int n) {
    //     boolean[] used= new boolean[n];
    //     int count=0;
    //     for (int i = 0; i < used.length; i++) {
    //         used[i]=true;
    //     }
    //     for (int i = 2; i <Math.sqrt(n) ; i++) {
    //         if(used[i]==true){
    //             for (int j = i*i; j < n; j=j+i) {
    //                 used[j]=false;
    //             }
    //         }
    //     }
    //     for (int i = 2; i < used.length; i++) {
    //         if(used[i]==true){
    //             count++;
    //         }
    //     }
    //     return count;
    // }

    //A BIT OPTIMISED SOLUTION BUT ALMOST SIMILAR
    public static int countPrimes(int n) {
        boolean[] used = new boolean[n];
        int count=0;
        for (int i = 2; i*i<n ; i++) {
            if(!used[i]){
                for (int j = i*i; j < n; j=j+i) {
                    used[j]=true;   //here false → prime  && true  → composite
                }
            }
        }
        for (int i = 2; i <n; i++) {
            if(!used[i]){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int n=10;
        int ans=countPrimes(n);
        System.out.println(ans);
    }
}
