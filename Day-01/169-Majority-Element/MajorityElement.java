public class MajorityElement {

    public int majorityElement(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {

            for (int j = i + 1; j > 0; j--) {

                if (nums[j] < nums[j - 1]) {
                    swap(nums, j, j - 1);
                } else {
                    break;
                }
            }
        }

        return nums[nums.length / 2];
    }

    static void swap(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}