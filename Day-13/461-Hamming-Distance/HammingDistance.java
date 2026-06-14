public class HammingDistance {
    //BRIAN KERNIGHAN'S ALGORITHM
    public static void main(String[] args) {
        int x=1; //exmaple number
        int y=4; //exmaple number
        int xor=x^y;
        int count=0;
        while(xor!=0){
            xor&=(xor-1);
            count++;
        }
        System.out.println(count);
    }
}
