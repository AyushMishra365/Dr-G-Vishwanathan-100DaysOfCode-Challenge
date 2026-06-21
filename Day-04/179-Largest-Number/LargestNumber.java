public class LargestNumber {

    public String largestNumber(int[] nums) {

        String[] arr = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j > 0; j--) {

                String first = arr[j - 1] + arr[j];
                String second = arr[j] + arr[j - 1];

                if (first.compareTo(second) < 0) {
                    swap(arr, j - 1, j);
                } else {
                    break;
                }
            }
        }

        if (arr[0].equals("0")) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();

        for (String s : arr) {
            sb.append(s);
        }

        return sb.toString();
    }

    static void swap(String[] arr, int first, int second) {

        String temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}