import java.util.Arrays;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);

        // I couldn't use basic sorting methods because the constraint is 1 <= 10^5
        // and their time complexity would exceed the limit.

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }

        return false;
    }
}