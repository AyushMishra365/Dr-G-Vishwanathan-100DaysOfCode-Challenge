public class StringToIntegerAtoi {
    public static int myAtoi(String s) {
        //method 1: This method is working for all test cases and is also fast
        int i = 0;
        int n = s.length();
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
        if (i == n) {
            return 0;
        }
        int sign = 1;
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            if (s.charAt(i) == '-') {  //takes sign here if negative and multiplies it at last with the value in string
                sign = -1;
            }
            i++;
        }
        int result = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {  //The maximum value of an int is: 2147483647
            //we can also write: if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)): This avoids hardcoding 7 and makes it clear where the value comes from.
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + digit;
            i++;
        }
        return result * sign;

//ALTERNATE OF THE ABOVE METHOD: ALMOST SIMILAR JUST USES RESULT AS LONG AND CHECKS FOR OVERFLOW AT THE END; if result taken as int then it will overflow.
//  class Solution {
//     public int myAtoi(String s) {
//         if (s == null || s.length() == 0) {
//             return 0;
//         } 
//         int i = 0;
//         int n = s.length();     
//         // Step 1: Skip leading whitespace
//         while (i < n && s.charAt(i) == ' ') {
//             i++;
//         }       
//         // Check if we've reached the end
//         if (i == n) {
//             return 0;
//         }     
//         // Step 2: Check for sign
//         int sign = 1;
//         if (s.charAt(i) == '+') {
//             i++;
//         } else if (s.charAt(i) == '-') {
//             sign = -1;
//             i++;
//         }
//         // Step 3: Read digits and convert
//         long res = 0;
//         while (i < n && Character.isDigit(s.charAt(i))) {
//             int digit = s.charAt(i) - '0';
//             res = res * 10 + digit;       
//             if (sign * res <= Integer.MIN_VALUE) {
//                 return Integer.MIN_VALUE;
//             }
//             if (sign * res >= Integer.MAX_VALUE) {
//                 return Integer.MAX_VALUE;
//             }       
//             i++;
//         }    
//         // Step 4: Apply sign and return
//         return (int)(res * sign);        
//     }
// }

    //Another method but still not working for some test cases(for very big values and is relatably slow)
    //     StringBuilder sb= new StringBuilder();
    //     s=s.trim();
    //     if(s.length()==0) return 0;
    //     int i=0;
    //     if(s.charAt(0)=='-' || s.charAt(0)=='+'){
    //             sb.append(s.charAt(0));
    //             i=1;
    //     }
    //     for(;i<s.length();i++){
    //         if(Character.isDigit(s.charAt(i))) sb.append(s.charAt(i));
    //         else{
    //             break;
    //         }
    //     }
    //     if(sb.length() == 0 || sb.toString().equals("+") || sb.toString().equals("-")) return 0;
    //     long num;
    //     try{
    //         num = Long.parseLong(sb.toString());
    //     }
    //     catch(NumberFormatException e){
    //         if(sb.charAt(0) == '-')
    //             return Integer.MIN_VALUE;
    //         else
    //             return Integer.MAX_VALUE;
    //     }
    //     if(num > Integer.MAX_VALUE)
    //         return Integer.MAX_VALUE;

    //     if(num < Integer.MIN_VALUE)
    //         return Integer.MIN_VALUE;

    //     return (int)num;
    // }
    // public static void main(String[] args) {
    //     String s="       -00000049993933948384984938984943894893849384939483992";
    //     System.out.println(myAtoi(s));
    }
}
