public class NumberCompliment {
    public static void main(String[] args) {
        int num=5; //example number
        int mask=1;
        while(mask<num){
            mask=(mask<<1)|1;
        }
        System.out.println(num^mask);
    }
}
