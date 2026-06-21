public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        for (int i = 0; i < nums1.length - 1; i++) {

            for (int j = i + 1; j > 0; j--) {

                if (nums1[j] < nums1[j - 1]) {
                    swap(nums1, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}