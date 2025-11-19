package Array;

import java.util.Arrays;

class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int k = 1;
        int n = nums.length;

        for (int num : nums) {
            if (num == k) {
                k++;
            }
        }
        return k;
    }
}
