public class MaximumProductOfTwoElementsInAnArray {

    public int maxProduct(int[] nums) {

        int firstMax = 0;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > nums[firstMax]) {
                firstMax = i;
            }
        }

        int secondMax = 0;

        for (int i = 0; i < nums.length; i++) {

            if (i != firstMax && nums[i] > nums[secondMax]) {
                secondMax = i;
            }
        }

        return (nums[firstMax] - 1) * (nums[secondMax] - 1);
    }
}