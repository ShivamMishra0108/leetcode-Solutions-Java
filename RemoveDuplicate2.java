package Array;

//  LEETCODE 80

class RemoveDuplicate2 {
    public int removeDuplicates(int[] nums) {
        int k = 0; // slow pointer
        for (int x : nums) {

            if (k < 2 || x != nums[k - 2]) {
                nums[k] = x;
                k++;
            }
        }

        return k;
    }
}
