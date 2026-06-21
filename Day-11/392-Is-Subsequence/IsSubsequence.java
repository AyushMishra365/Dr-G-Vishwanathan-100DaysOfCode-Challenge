public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {

        StringBuilder sb = new StringBuilder();

        int start = 0;

        for (int i = 0; i < s.length(); i++) {

            for (int j = start; j < t.length(); j++) {

                if (s.charAt(i) == t.charAt(j)) {

                    sb.append(t.charAt(j));

                    start = j + 1;

                    break;
                }
            }
        }

        return s.equals(sb.toString());
    }
}