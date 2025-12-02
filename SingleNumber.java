package Array;


import java.util.Arrays;
class SingleNumber {
    public int singleNumber(int[] nums) {

        int n = nums.length;
        int idx;

        Arrays.sort(nums);
        if (n == 1)return nums[0];
        if(nums[0] != nums[1])return nums[0];
        if(nums[n-1] != nums[n-2])return nums[n-1];
        int lo=0, hi=n-1;
        while(lo<=hi){
            int mid = lo +(hi-lo)/2;
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1])return nums[mid];
            int f = mid , s = mid;
            if(nums[mid] == nums[mid-1]) f = mid-1;
            else s = mid+1;
            int lc = f - lo;
            int rc = hi - s;
            if(lc %2 == 0)lo = s +1;
            else hi = f - 1;
        }
        return 442;

    }
}