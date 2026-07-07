public class ConcatenateNonZeroDigitsAndMultiplyBySumI {
    public long sumAndMultiply(int n) {
        long sum=0;
        long value=0;
        for(char c: String.valueOf(n).toCharArray()){
            if(c!='0'){
                value=value*10+c-'0';
                sum+=c-'0';
            }
        }
        return sum*value;
//taking too much space so error otherwis elogic correct
        // String s=String.valueOf(n); 
        // StringBuilder sb= new StringBuilder();   
        // char[] arr= s.toCharArray(); 
        // long sum=0;
        // for(int i=0; i<s.length();i++){
        //     if(arr[i]=='0'){
        //         continue;
        //     }
        //     else{
        //         sum+=arr[i]-'0';
        //         sb.append(arr[i]);
        //     }
        // }
        // long value=Long.parseLong(sb.toString());
        // return sum * value;
    }
}
