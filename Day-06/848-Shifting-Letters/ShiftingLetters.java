public class ShiftingLetters {

    public String shiftingLetters(String s, int[] shifts) {

        long sm = 0;

        for (int i = 0; i < shifts.length; i++) {
            sm += shifts[i];
        }

        char[] sa = s.toCharArray();

        for (int i = 0; i < sa.length; i++) {

            sa[i] = (char) ('a' + (sa[i] - 'a' + sm) % 26);

            sm -= shifts[i];
        }

        return new String(sa);
    }
}