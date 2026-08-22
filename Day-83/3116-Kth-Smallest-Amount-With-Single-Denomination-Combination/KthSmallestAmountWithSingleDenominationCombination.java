public class KthSmallestAmountWithSingleDenominationCombination {
    public long findKthSmallest(int[] coins, int k) {
        long low=1;
        long high=1;
        while(count(high,coins)<k){
            high*=2;
        }
        while(low<high){
            long mid=low+(high-low)/2;
            if(count(mid,coins)>=k){
                high=mid;
            }
            else low =mid+1;
        }
        return low;
    }
    public long count(long x, int[] coins){
        long count=0;
        int total=1<<coins.length;  //give the toal number of combinations possible by the numbers of coins
        for(int mask=1;mask<total;mask++){
            long lcm=1;
            int selected=0;
            for(int j=0;j<coins.length;j++){
                if((mask&(1<<j))!=0){
                    selected++;
                    lcm=lcm(lcm,coins[j]);
                    if(lcm>x){
                        break;
                    }
                }
            }
            if(lcm>x){
                continue;
            }
            if(selected%2==1){
                count+=x/lcm;
            }
            else count-=x/lcm;
        }
        return count;
    }
    public long lcm(long a, long b){
        return (a/gcd(a,b))*b;
    }
    public long gcd(long a,long b){
        while(b!=0){
            long temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
//BRUTE FORCE - TLE CODE

    // public long findKthSmallest(int[] coins, int k) {
    //     // ArrayList<Integer> arr= new ArrayList<>(); --> we are not gonna use an arraylist because adding each element in arraylist 
    //     //until size of arraylist is less than k is not a good idea when k is very large as it will be memory limit exceeded
    //     int count=0;
    //     int i=1;
    //     //while(arr.size()<k)  --> we are not using this as mentioned above
    //     while(count<k){ 
    //         boolean found=false;
    //         for (int j = 0; j < coins.length; j++) {
    //             if(i%coins[j]==0){
    //                 found=true;
    //                 break;
    //             }
    //         }
    //         if(found){
    //             // arr.add(i)  --> we are not using this as mentioned above
    //             count++;
    //             if(count==k){
    //                 return i;
    //             }
    //         }
    //         i++;
    //     }
    //     return -1;
    // }
}    

