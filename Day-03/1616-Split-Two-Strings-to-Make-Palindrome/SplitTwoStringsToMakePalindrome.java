public class SplitTwoStringsToMakePalindrome {

    public boolean checkPalindromeFormation(String a, String b) {

        a = a.toLowerCase();
        b = b.toLowerCase();

        return check(a, b) || check(b, a);
    }

    static boolean check(String a, String b) {

        int i = 0;
        int j = a.length() - 1;

        while (i < j && a.charAt(i) == b.charAt(j)) {
            i++;
            j--;
        }

        return isPalindrome(a, i, j) || isPalindrome(b, i, j);
    }

    static boolean isPalindrome(String s, int i, int j) {

        while (i < j) {

            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}