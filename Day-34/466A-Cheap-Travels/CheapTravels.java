import java.util.Scanner;
public class CheapTravels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
//THIS IS SIMULATION CODE BUT THIS IS NOT THAT GOOD APPROACH FOR THIS PROBLEM. WE CAN SOLVE THIS PROBLEM USING MATHS.
///BOTH THE MATHS AND SIMULATION APPROACH ARE EXACTLY THE LOGIC IN CODE BUT SIMULATION IS RUNNING IN LOOPS AND MATHS IS MATHS.
        // If buying m single tickets is cheaper, buy everything individually.
        // if(b>=a*m){
        //     sum=a*n;
        // }
        // else{
        //     // Keep buying special tickets while we can.
        //     while(n>=m){
        //         sum+=b;
        //         n-=m;
        //     }
        //     // Decide how to cover the remaining rides.
        //     if(n*a<=b){
        //         sum+=n*a;
        //     }
        //     else{
        //         sum+=b;
        //     }
        // }
        // System.out.println(sum);
        // sc.close();

//MATHS APPROACH
         // Option 1: Buy all rides individually
        long option1 = n * a;    //similar to first if statement of simulation code 
        // Option 2: Buy as many special tickets as possible, then buy the remaining rides individually
        long option2 = (n / m) * b + (n % m) * a;    //the while condition + the if statement after while conditon ends 
        // Option 3: Buy only special tickets
        // (even if some rides are unused)
        long option3 = ((n + m - 1) / m) * b; //the while condition + the else statement after while condition ends
        //Why is ((n + m - 1) / m) used? --> It computes the ceiling of n / m, i.e., the minimum number of special tickets needed to cover all rides.
        System.out.println(Math.min(option1, Math.min(option2, option3)));
        sc.close();
    }
}
