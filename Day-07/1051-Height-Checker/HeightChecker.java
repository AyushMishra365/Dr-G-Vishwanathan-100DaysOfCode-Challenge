public class HeightChecker {

    public int heightChecker(int[] heights) {

        int[] expected = new int[heights.length];

        for (int i = 0; i < expected.length; i++) {
            expected[i] = heights[i];
        }

        for (int i = 0; i < expected.length - 1; i++) {

            for (int j = i + 1; j > 0; j--) {

                if (expected[j] < expected[j - 1]) {
                    swap(expected, j, j - 1);
                } else {
                    break;
                }
            }
        }

        int count = 0;

        for (int i = 0; i < heights.length; i++) {

            if (heights[i] != expected[i]) {
                count++;
            }
        }

        return count;
    }

    static void swap(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}